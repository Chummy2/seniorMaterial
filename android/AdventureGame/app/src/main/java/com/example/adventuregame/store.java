package com.example.adventuregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class store extends AppCompatActivity {

    private int money;
    private int clothes;
    private int food;
    private int health;
<<<<<<< HEAD
    private int day=1;
=======
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Intent grabMoney = getIntent();
        if (grabMoney != null && grabMoney.hasExtra("money") && grabMoney.hasExtra("food") && grabMoney.hasExtra("health")) {
            money = grabMoney.getIntExtra("money", 0);
            food = grabMoney.getIntExtra("food", 0);
            health = grabMoney.getIntExtra("health", 0);
            clothes = grabMoney.getIntExtra("clothes", 0);
<<<<<<< HEAD
            day = grabMoney.getIntExtra("day", 0);
=======
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
            TextView moneyText = findViewById(R.id.money);
            moneyText.setText("Money $" + money);
            TextView healthAndFoodText = findViewById(R.id.healthAndFood);
            healthAndFoodText.setText("Health " + health + "/10  " + "Food " + food + "/10");
        }

        Button clothesButton = findViewById(R.id.clothesButton);
        clothesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (money > 49) {
                    clothes = 1;
                    money -= 50;
                    TextView moneyText = findViewById(R.id.money);
                    moneyText.setText("Money $" + money);
                } else {
                    Toast.makeText(store.this, "You can't afford this buddy", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button foodButton = findViewById(R.id.foodButton);
        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                if (money > 4 && food < 10) {
                    food += 1;
                    money -= 5;
=======
                if (money > 9 && food < 10) {
                    food += 1;
                    money -= 10;
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
                    TextView healthAndFoodText = findViewById(R.id.healthAndFood);
                    healthAndFoodText.setText("Health " + health + "/10  " + "Food " + food + "/10");
                    TextView moneyText = findViewById(R.id.money);
                    moneyText.setText("Money $" + money);
                } else if (food == 10) {
                    Toast.makeText(store.this, "You have max food", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(store.this, "You can't afford this buddy", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button healthButton = findViewById(R.id.healthButton);
        healthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (money > 9 && health < 10) {
                    health += 1;
                    money -= 10;
                    TextView healthAndFoodText = findViewById(R.id.healthAndFood);
                    healthAndFoodText.setText("Health " + health + "/10  " + "Food " + food + "/10");
                    TextView moneyText = findViewById(R.id.money);
                    moneyText.setText("Money $" + money);
                } else if (health == 10) {
                    Toast.makeText(store.this, "You have max health", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(store.this, "You can't afford this buddy", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the InfoActivity
                Intent back = new Intent(store.this, start.class);
                back.putExtra("money", money);
                back.putExtra("food", food);
                back.putExtra("health", health);
                back.putExtra("clothes", clothes);
<<<<<<< HEAD
                back.putExtra("day", day);
=======
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
                startActivity(back);
            }
        });
    }
}