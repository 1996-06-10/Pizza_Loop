package com.example.pizzaloop.activities;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pizzaloop.R;

public class Pop extends PaymentActivity{
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);
        myDialog = new Dialog(this);
    }
    public void ShowPop(View v){
        EditText edemail;
        EditText edcard;
        Button btnconfirm;
        Button btncancel;
    }

}

