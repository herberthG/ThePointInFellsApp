package com.example.mythepountinfellsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuOrderActivity extends AppCompatActivity {

    EditText orderQuantityET;
    TextView orderDollarTV;
    Button addDollarBT;
    Button addTaxBT;
    TextView totalDollarTV;
    int subtotal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_order);


        orderQuantityET = (EditText) findViewById(R.id.OrderQuantity);
        orderDollarTV = (TextView) findViewById(R.id.OrderDollar);
        addDollarBT = (Button) findViewById(R.id.AddDollar);
        addTaxBT = (Button) findViewById(R.id.AddTax);
        totalDollarTV = (TextView) findViewById(R.id.TotalDollar);

        addDollarBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int orderQuantity=Integer.parseInt(orderQuantityET.getText().toString());
                subtotal=orderQuantity*10;
                orderDollarTV.setText("$"+subtotal);
            }
        });

        addTaxBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tax=subtotal*0.06;
                double total=subtotal+tax;
                totalDollarTV.setText("$"+total);

            }
        });


    }

}
