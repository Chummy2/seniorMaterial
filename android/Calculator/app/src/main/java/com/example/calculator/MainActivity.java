package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1TXT=findViewById(R.id.number1TXT);
        EditText number2TXT=findViewById(R.id.number2TXT);
        TextView output = findViewById(R.id.outputTXT);
        Button addBTN = findViewById(R.id.addBTN);
        Button addBTN2 = findViewById(R.id.subBTN);
        Button addBTN3 = findViewById(R.id.mulBTN);
        Button addBTN4 = findViewById(R.id.divBTN);




        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer =num1+num2;
                output.setText(String.valueOf(answer));

            }
        });
        addBTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer =num1-num2;
                output.setText(String.valueOf(answer));

            }
        });
        addBTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer =num1*num2;
                output.setText(String.valueOf(answer));

            }
        });
        addBTN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer =num1/num2;
                output.setText(String.valueOf(answer));

            }
        });
    }
}