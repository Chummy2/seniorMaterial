package com.example.adventuregame;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class beg1 extends AppCompatActivity {

    private int money = 0;
    private int food;
    private int day;
    private int health;

=======
import android.os.Bundle;

public class beg1 extends AppCompatActivity {

>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg1);
<<<<<<< HEAD

        Intent grabMoney = getIntent();
        if (grabMoney != null && grabMoney.hasExtra("money")) {
            money = grabMoney.getIntExtra("money", 0);
            food = grabMoney.getIntExtra("food", 0);
            day = grabMoney.getIntExtra("day", 0);
            health = grabMoney.getIntExtra("health", 0);
            money += 10;
            System.out.println(day);
            day+=1;
            System.out.println(day);
        }

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the start activity
                Intent back = new Intent(beg1.this, start.class);
                back.putExtra("money", money);
                back.putExtra("food", food);
                back.putExtra("day", day);
                back.putExtra("health", health);
                startActivity(back);
            }
        });
    }}
=======
    }
}
>>>>>>> 128a13c6bce01cb86fc68e7007586945cbc4dd06
