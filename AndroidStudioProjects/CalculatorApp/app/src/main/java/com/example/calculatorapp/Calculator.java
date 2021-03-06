package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] result = {0};
        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextTextPersonName4= (EditText) findViewById(R.id.editTextTextPersonName4);
                EditText editTextTextPersonName5= (EditText) findViewById(R.id.editTextTextPersonName5);
                int num1=Integer.parseInt(editTextTextPersonName4.getText().toString());
                int num2=Integer.parseInt(editTextTextPersonName5.getText().toString());
                result[0] =num1+num2;
            }
        });
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextTextPersonName4= (EditText) findViewById(R.id.editTextTextPersonName4);
                EditText editTextTextPersonName5= (EditText) findViewById(R.id.editTextTextPersonName5);
                int num1=Integer.parseInt(editTextTextPersonName4.getText().toString());
                int num2=Integer.parseInt(editTextTextPersonName5.getText().toString());
                result[0]=num1-num2;
            }
        });
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextTextPersonName4= (EditText) findViewById(R.id.editTextTextPersonName4);
                EditText editTextTextPersonName5= (EditText) findViewById(R.id.editTextTextPersonName5);
                int num1=Integer.parseInt(editTextTextPersonName4.getText().toString());
                int num2=Integer.parseInt(editTextTextPersonName5.getText().toString());
                result[0]=num1*num2;
            }
        });
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextTextPersonName4= (EditText) findViewById(R.id.editTextTextPersonName4);
                EditText editTextTextPersonName5= (EditText) findViewById(R.id.editTextTextPersonName5);
                int num1=Integer.parseInt(editTextTextPersonName4.getText().toString());
                int num2=Integer.parseInt(editTextTextPersonName5.getText().toString());
                result[0]=num1/num2;
            }
        });
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextTextPersonName6=(EditText) findViewById(R.id.editTextTextPersonName6);
                editTextTextPersonName6.setText(""+result[0]);
            }
        });
    }
}