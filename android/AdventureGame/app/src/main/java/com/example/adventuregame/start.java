package com.example.adventuregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class start extends AppCompatActivity {

    private int health = 5;
    private int food = 5;
    private int money = 500;
    private int day = 1;
    private int clothes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        TextView moneyText = findViewById(R.id.money);
        moneyText.setText("Money $" + money);
        TextView healthAndFoodText = findViewById(R.id.healthAndFood);
        healthAndFoodText.setText("Health " + health + "/10  " + "Food " + food + "/10");
        TextView dayText = findViewById(R.id.day);
        dayText.setText("Day " + day);


        Button jobButton = findViewById(R.id.jobButton);
        jobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent job = new Intent(start.this, job.class);
                job.putExtra("jobHealth", health);
                job.putExtra("jobFood", food);
                job.putExtra("money", money);
                job.putExtra("clothes", clothes); // Include the clothes value in the intent
                day += 1;
                startActivity(job);
            }
        });

        Button storeButton = findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent store = new Intent(start.this, store.class);
                store.putExtra("money", money);
                store.putExtra("food", food);
                store.putExtra("health", health);
                startActivity(store);
            }
        });
        Button workButton = findViewById(R.id.workButton);
        workButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Generate a random number to determine the destination activity
                int randomNumber = new Random().nextInt(3); // Change 3 to the number of activities you have

                // Start the corresponding activity based on the random number
                Intent random;
                switch (randomNumber) {
                    case 0:
                        random = new Intent(start.this, work1.class);
                        startActivity(random);
                        break;
                    case 1:
                        random = new Intent(start.this, work2.class);
                        startActivity(random);
                        break;
                    case 2:
                        Toast.makeText(start.this, "You didn't find work", Toast.LENGTH_LONG).show();
                        TextView dayText = findViewById(R.id.day);
                        day+=1;
                        health-=1;
                        food-=1;
                        TextView healthAndFoodText = findViewById(R.id.healthAndFood);
                        healthAndFoodText.setText("Health " + health + "/10  " + "Food " + food + "/10");
                        dayText.setText("Day " + day);
                        break;
                }
            }
        });
        Button begButton = findViewById(R.id.begButton);
        begButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Generate a random number to determine the destination activity
                int randomNumber = new Random().nextInt(3); // Change 3 to the number of activities you have

                // Start the corresponding activity based on the random number
                Intent random;
                switch (randomNumber) {
                    case 0:
                        random = new Intent(start.this, beg1.class);
                        startActivity(random);
                        break;
                    case 1:
                        random = new Intent(start.this, beg2.class);
                        startActivity(random);
                        break;
                    case 2:
                        Toast.makeText(start.this, "Nobody even looked at you", Toast.LENGTH_LONG).show();
                        TextView dayText = findViewById(R.id.day);
                        day+=1;
                        health-=1;
                        food-=1;
                        TextView healthAndFoodText = findViewById(R.id.healthAndFood);
                        healthAndFoodText.setText("Health " + health + "/10  " + "Food " + food + "/10");
                        dayText.setText("Day " + day);
                        break;
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Retrieve updated values from the intent when the activity is resumed
        if (getIntent().hasExtra("money")) {
            money = getIntent().getIntExtra("money", money);
            food = getIntent().getIntExtra("food", food);
            health = getIntent().getIntExtra("health", health);
            clothes = getIntent().getIntExtra("clothes", clothes);

            updateUI();
        }
    }

    // Update the UI with the current values
    private void updateUI() {
        TextView moneyText = findViewById(R.id.money);
        moneyText.setText("Money $" + money);
        TextView healthAndFoodText = findViewById(R.id.healthAndFood);
        healthAndFoodText.setText("Health " + health + "/10  " + "Food " + food + "/10");
    }
}