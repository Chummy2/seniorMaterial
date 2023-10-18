package com.example.intentpractice;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button second;
    private EditText secondInformation;
    private TextView secondLBL;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);//sets layout for java file to use
        second = findViewById(R.id.secondBTN);
        secondInformation = findViewById(R.id.secondUI);
        secondLBL = findViewById(R.id.secondLBL);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step 3; set up your intent
                //IntentClass objName = new IntentConstructor(Activity you're running, the activity you're going to);
                Intent i = new Intent(SecondActivity.this,thirdActivity.class);
                i.putExtra("user Input",String.valueOf(firstInformation.getText()));


                //step 4: go to your new activity
                startActivity(i);
            }
        });
    }
}
