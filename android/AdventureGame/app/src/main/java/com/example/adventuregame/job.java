package com.example.adventuregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

public class job extends AppCompatActivity {
<<<<<<< HEAD
    private int money = 0;
    private int food;
    private int day=0;
    private int health;
    private int clothes;
=======
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
<<<<<<< HEAD
        Intent grabHealthAndFood = getIntent();
        if (grabHealthAndFood != null && grabHealthAndFood.hasExtra("health") && grabHealthAndFood.hasExtra("food") && grabHealthAndFood.hasExtra("clothes")) {
            money = grabHealthAndFood.getIntExtra("money", 0);
            food = grabHealthAndFood.getIntExtra("food", 0);
            day = grabHealthAndFood.getIntExtra("day", 0);
            health = grabHealthAndFood.getIntExtra("health", 0);
            clothes = grabHealthAndFood.getIntExtra("clothes", 0);
        }
=======
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the InfoActivity
                Intent back = new Intent(job.this, start.class);
<<<<<<< HEAD
                back.putExtra("money", money);
                back.putExtra("food", food);
                back.putExtra("day", day);
                back.putExtra("health", health);
                back.putExtra("clothes", clothes);
=======
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
                startActivity(back);
            }
        });
        Button applyButton = findViewById(R.id.applyButton);
        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the InfoActivity
<<<<<<< HEAD
                    if (health > 6 && food > 6 && clothes == 1) {
                        Intent win = new Intent(job.this, win.class);
                        startActivity(win);
                    } else if (health <=6 && health <=6 && clothes != 1) {
                        Toast.makeText(job.this, "You need more health and food to get this job and get some clothes dude. Try again another day", Toast.LENGTH_LONG).show();
                    } else if (health < 7 && food < 7) {
                        Toast.makeText(job.this, "You need more health and food to get this job sorry. Try again another day", Toast.LENGTH_LONG).show();
                    } else if (health < 8) {
                        Toast.makeText(job.this, "You need more health to get this job sorry. Try again another day", Toast.LENGTH_LONG).show();
                    } else if (food < 8) {
=======
                Intent grabHealthAndFood = getIntent();
                if (grabHealthAndFood != null && grabHealthAndFood.hasExtra("jobHealth")
                        && grabHealthAndFood.hasExtra("jobFood") && grabHealthAndFood.hasExtra("clothes")) {
                    int jobHealth = grabHealthAndFood.getIntExtra("jobHealth", 0);
                    int jobFood = grabHealthAndFood.getIntExtra("jobFood", 0);
                    int clothes = grabHealthAndFood.getIntExtra("clothes", 0);

                    if (jobHealth > 1 && jobFood > 1 && clothes == 1) {
                        Intent win = new Intent(job.this, win.class);
                        startActivity(win);
                    } else if (jobHealth < 7 && jobFood < 7 && clothes != 1) {
                        Toast.makeText(job.this, "You need more health and food to get this job and get some clothes dude. Try again another day", Toast.LENGTH_LONG).show();
                    } else if (jobHealth < 7 && jobFood < 7) {
                        Toast.makeText(job.this, "You need more health and food to get this job sorry. Try again another day", Toast.LENGTH_LONG).show();
                    } else if (jobHealth < 8) {
                        Toast.makeText(job.this, "You need more health to get this job sorry. Try again another day", Toast.LENGTH_LONG).show();
                    } else if (jobFood < 8) {
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
                        Toast.makeText(job.this, "You need more food to get this job sorry. Try again another day", Toast.LENGTH_LONG).show();
                    } else if (clothes != 1) {
                        Toast.makeText(job.this, "You need clothes man", Toast.LENGTH_LONG).show();
                    }


<<<<<<< HEAD
            }
=======
            }}
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
        });
    }
}