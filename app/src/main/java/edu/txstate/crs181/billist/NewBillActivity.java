package edu.txstate.crs181.billist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class NewBillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bill);

        final EditText restaurantName = findViewById(R.id.txtRestaurantName);
        final EditText billAmount = findViewById(R.id.txtBillAmount);
        final EditText tipPercentage = findViewById(R.id.txtTipPercentage);
        final EditText tipAmount = findViewById(R.id.txtTipAmount);
        final TextView totalBill = findViewById(R.id.txtTotalBill);
        final SeekBar tipBar = findViewById(R.id.skbTipBar);
        final ProgressBar progressBar = findViewById(R.id.progressBar);

        tipPercentage.setFocusable(false);
        tipAmount.setFocusable(false);
        totalBill.setFocusable(false);

        Button saveBill = findViewById(R.id.btnSaveBill);
        Button calculateBill = findViewById(R.id.btnCalculateBill);
        Button clear = findViewById(R.id.btnClear);

        //***START*** --- Displaying tipBar value
        tipBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int percentage, boolean fromUser) {
                progressBar.setProgress(percentage);
                tipPercentage.setText("" + percentage);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //***END***

        //Calculate Button
        calculateBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strBillAmount = billAmount.getText().toString();
                double dblBillAmount = Double.parseDouble(strBillAmount);

                String strTipPercentage = tipPercentage.getText().toString();
                double dblTipPercentage = Double.parseDouble(strTipPercentage);

                double dblTipAmount = dblBillAmount * (dblTipPercentage/100);

                double dblTotalBill = dblTipAmount + dblBillAmount;

                DecimalFormat moneyFormat = new DecimalFormat("$#,###.##");
                String strTotalBill = moneyFormat.format(dblTotalBill);
                String strTipAmount = moneyFormat.format(dblTipAmount);

                tipAmount.setText(strTipAmount);
                totalBill.setText(strTotalBill);


            }
        });

        //Save Bill button
        saveBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        //Clear fields button
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restaurantName.setText("");
                billAmount.setText("");
                tipPercentage.setText("");
                tipAmount.setText("");
                totalBill.setText("");
            }


        });
    }
}
