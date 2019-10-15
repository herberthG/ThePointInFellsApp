package com.example.mythepountinfellsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuOrderActivity extends AppCompatActivity {

    EditText OrderQuantity;
    TextView OrderDollar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_order);


        OrderQuantity = (EditText) findViewById(R.id.OrderQuantity);
        OrderDollar = (TextView) findViewById(R.id.OrderDollar);
    }

}
