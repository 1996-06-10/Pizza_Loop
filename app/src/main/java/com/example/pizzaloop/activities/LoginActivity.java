package com.example.pizzaloop.activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.pizzaloop.R;

public class LoginActivity extends AppCompatActivity {

    EditText userName,passWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName = findViewById(R.id.username);
        passWord = findViewById(R.id.password);
    }
            public void onLogin(View view){
                Intent intent= new Intent(getBaseContext(),PizzaMenu.class);
                startActivity(intent);
            }











}

