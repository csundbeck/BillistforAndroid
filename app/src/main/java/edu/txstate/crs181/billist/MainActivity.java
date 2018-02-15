package edu.txstate.crs181.billist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.billist_app_icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button newBill = findViewById(R.id.btnNewBill);
        Button myBillist = findViewById(R.id.btnMyBillist);

        newBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NewBillActivity.class));
            }
        });
    }
}
