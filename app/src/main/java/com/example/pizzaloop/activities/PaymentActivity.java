package com.example.pizzaloop.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.pizzaloop.R;

public class PaymentActivity extends AppCompatActivity {
    RadioGroup g1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        g1=findViewById(R.id.g1);
        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cash_on_delivery){
                    startActivity(new Intent(PaymentActivity.this,Pop.class));

                }
            }
        });
    }
}
