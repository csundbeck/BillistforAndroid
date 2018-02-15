package edu.txstate.crs181.billist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewBillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bill);

        final EditText restaurantName = findViewById(R.id.txtRestaurantName);
        final EditText billAmount = findViewById(R.id.txtBillAmount);
        final EditText tipPercentage = findViewById(R.id.txtTipPercentage);
        final EditText tipAmount = findViewById(R.id.txtTipAmount);
        final EditText totalBill = findViewById(R.id.txtTotalBill);

        Button saveBill = findViewById(R.id.btnSaveBill);
        Button calculateBill = findViewById(R.id.btnCalculateBill);
        Button clear = findViewById(R.id.btnClear);

        //Save Bill button
        saveBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //Calculate Button
        calculateBill.setOnClickListener(new View.OnClickListener() {
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
