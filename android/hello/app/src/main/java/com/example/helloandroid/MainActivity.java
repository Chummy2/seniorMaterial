package com.example.helloandroid;
//DO NOT..... DO NIT SCREW WITH THE PACKAGES
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//public for all files to access it
//class -> defining a class for the JVM
// mainactivity -> this is where your entire app starts ... kinda of
//extents appcompatactivity do not
public class MainActivity extends AppCompatActivity {

    //this overides the onCreate method in app compatactivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sayHello(View v){
        //view v -> is a object of the view class which assist the button to find this f(x)
        // this goes back to the model view controller set up or game loop in love2d
        //v will now allow the xml to see the f(x)
        // YOU MUST DO THIS for using an onClick

        //obtain the info from the widgets
        EditText userInput = findViewById(R.id.questionText );
        TextView greetingText = findViewById(R.id.answertextView);
        //output something to the outputTextView
        greetingText.setText("Hi "+userInput.getText()+" Nice to meet you!");
    }
}