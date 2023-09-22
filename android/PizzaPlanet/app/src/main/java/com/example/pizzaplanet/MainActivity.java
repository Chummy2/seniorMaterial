package com.example.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckBox smallCB = findViewById(R.id.cheCB);
        CheckBox mediumCB = findViewById(R.id.pepCB);
        CheckBox largeCB = findViewById(R.id.sauCB);
        Button orderBTN = findViewById(R.id.orderBTN);
        RadioGroup rbGroup = findViewById(R.id.radioGroup);
        RadioButton smallRB = findViewById(R.id.smallRB);
        RadioButton medRB = findViewById(R.id.medRB);
        RadioButton larRB = findViewById(R.id.larRB);

        orderBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String order ="";
                String topping="";
                if (smallCB.isChecked()) {
                    TextView t = findViewById(R.id.textView);
                    topping+=("Cheese");
                }
                if (mediumCB.isChecked()) {
                    TextView t = findViewById(R.id.textView);
                    topping+=("Peperoni");
                }
                if (largeCB.isChecked()) {
                    TextView t = findViewById(R.id.textView);
                    topping+=("Sausage");
                }

                if (smallRB.isChecked()){
                    order+="small"+topping+"Pizza";
                }
                Toast.makeText(MainActivity.this,order,Toast.LENGTH_LONG).show();
                log.d("Pizza Order",order);





            }
        });

    }
}