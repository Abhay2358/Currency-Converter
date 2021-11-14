package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmounteditText);

        Double dollarAmountDouble;
        dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());
        Double rupeeAmount = dollarAmountDouble * 75.54;

        Toast.makeText(MainActivity.this, "₹" + rupeeAmount.toString(),Toast.LENGTH_SHORT).show();;

        Log.i("amount",dollarAmountEditText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
