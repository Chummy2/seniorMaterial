package com.example.madlib;

import static com.example.madlib.R.*;
import static com.example.madlib.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        EditText firstChoice=findViewById(id.firstChoice);
        EditText secondChoice=findViewById(id.secondChoice);
        EditText thirdChoice=findViewById(id.thirdChoice);
        EditText fourthChoice=findViewById(id.fourthChoice);
        EditText fifthChoice=findViewById(id.fifthChoice);
        EditText sixthChoice=findViewById(id.sixthChoice);
        EditText seventhChoice=findViewById(id.seventhChoice);
        EditText eighthChoice=findViewById(id.eighthChoice);
        Button firstStory = findViewById(id.firstStory);
        Button secondStory = findViewById(id.secondStory);
        Button thirdStory = findViewById(id.thirdStory);
        Button randomStory = findViewById(id.randomStory);
        Button enterButton = findViewById(id.enterButton);
        Button resetButton = findViewById(id.resetButton);
        TextView outputText=findViewById(id.outputText);
        //got stories from chatgpt
        firstStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] story= ("Once upon a time, in a (1 - Place) far, far away, there lived a(n) (2 - Adjective) (3 - Animal). This (3 - Animal) had a peculiar habit of (4 - Verb ending in -ing) all day long.\n " +
                                "One sunny (5 - Day of the week), (6 - Name) decided to pay a visit to this unusual creature. (6 - Name) brought a basket filled with (7 - Plural Noun) and a(n) (8 - Adjective) hat.\n " +
                                "As soon as (6 - Name) arrived at the (1 - Place), the (3 - Animal) stopped (4 - Verb ending in -ing) and looked up with (8 - Adjective) eyes. It seemed that the (3 - Animal) was in dire need of some (7 - Plural Noun).\n " +
                                "After sharing the (7 - Plural Noun) with the (3 - Animal), (6 - Name) and the (3 - Animal) spent the rest of the (5 - Day of the week) (4 - Verb ending in -ing) together. It turned out to be a(n) (2 - Adjective) day filled with laughter and (8 - Adjective) adventures.\n " +
                                "And so, (6 - Name) and the (3 - Animal) became the best of friends, and they continued to have (2 - Adjective) days at the (1 - Place) for years to come.\n").toCharArray();
                outputText.setText(String.valueOf(story));
            }
        });
        secondStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] story= ("One fine day, in the heart of (1 - Place), a(n) (2 - Adjective) (3 - Animal) was discovered (4 - Verb ending in -ing) around. It was a beautiful (5 - Day of the week), and (6 - Name) decided to explore this magical land.\n" +
                        "\n" +
                        "Armed with a backpack filled with (7 - Plural Noun) and wearing a(n) (8 - Adjective) hat, (6 - Name) set off on a grand adventure. Little did they know that (1 - Place) held many surprises, and their journey would lead to unforgettable encounters and (2 - Adjective) discoveries.\n" +
                        "\n" +
                        "As (6 - Name) ventured deeper into (1 - Place), they encountered (3 - Animal) of all shapes and sizes. Each (3 - Animal) had its own unique way of (4 - Verb ending in -ing), making the day even more (8 - Adjective).\n" +
                        "\n" +
                        "With their newfound friends, (6 - Name) explored the hidden wonders of (1 - Place) and created memories that would last a lifetime. And so, the adventure in (1 - Place) became a cherished tale, filled with (7 - Plural Noun) and (2 - Adjective) moments.").toCharArray();
                outputText.setText(String.valueOf(story));
            }
        });
        thirdStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] story= ("On a (2 - Adjective) (5 - Day of the week), (6 - Name) was at the (1 - Place) (4 - Verb ending in -ing) when a (3 - Animal) suddenly appeared. It wasn't just any (3 - Animal), but one that was carrying a bag full of (7 - Plural Noun). Intrigued, (6 - Name) approached the creature. To their surprise, the bag was (8 - Adjective), and that changed their entire day!").toCharArray();
                outputText.setText(String.valueOf(story));
            }
        });
        randomStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] story= ("Once upon a time, in a (1 - Place) far, far away, there lived a(n) (2 - Adjective) (3 - Animal). This (3 - Animal) had a peculiar habit of (4 - Verb ending in -ing) all day long.\n " +
                        "One sunny (5 - Day of the week), (6 - Name) decided to pay a visit to this unusual creature. (6 - Name) brought a basket filled with (7 - Plural Noun) and a(n) (8 - Adjective) hat.\n " +
                        "As soon as (6 - Name) arrived at the (1 - Place), the (3 - Animal) stopped (4 - Verb ending in -ing) and looked up with (8 - Adjective) eyes. It seemed that the (3 - Animal) was in dire need of some (7 - Plural Noun).\n " +
                        "After sharing the (7 - Plural Noun) with the (3 - Animal), (6 - Name) and the (3 - Animal) spent the rest of the (5 - Day of the week) (4 - Verb ending in -ing) together. It turned out to be a(n) (2 - Adjective) day filled with laughter and (8 - Adjective) adventures.\n " +
                        "And so, (6 - Name) and the (3 - Animal) became the best of friends, and they continued to have (2 - Adjective) days at the (1 - Place) for years to come.\n").toCharArray();
                char[] story2= ("One fine day, in the heart of (1 - Place), a(n) (2 - Adjective) (3 - Animal) was discovered (4 - Verb ending in -ing) around. It was a beautiful (5 - Day of the week), and (6 - Name) decided to explore this magical land.\n" +
                        "\n" +
                        "Armed with a backpack filled with (7 - Plural Noun) and wearing a(n) (8 - Adjective) hat, (6 - Name) set off on a grand adventure. Little did they know that (1 - Place) held many surprises, and their journey would lead to unforgettable encounters and (2 - Adjective) discoveries.\n" +
                        "\n" +
                        "As (6 - Name) ventured deeper into (1 - Place), they encountered (3 - Animal) of all shapes and sizes. Each (3 - Animal) had its own unique way of (4 - Verb ending in -ing), making the day even more (8 - Adjective).\n" +
                        "\n" +
                        "With their newfound friends, (6 - Name) explored the hidden wonders of (1 - Place) and created memories that would last a lifetime. And so, the adventure in (1 - Place) became a cherished tale, filled with (7 - Plural Noun) and (2 - Adjective) moments.").toCharArray();
                char[] story3= ("On a (2 - Adjective) (5 - Day of the week), (6 - Name) was at the (1 - Place) (4 - Verb ending in -ing) when a (3 - Animal) suddenly appeared. It wasn't just any (3 - Animal), but one that was carrying a bag full of (7 - Plural Noun). Intrigued, (6 - Name) approached the creature. To their surprise, the bag was (8 - Adjective), and that changed their entire day!").toCharArray();
                Random random = new Random();
                int randomNumber = random.nextInt(3);
                //https://www.w3schools.com/java/java_switch.asp
                char[] selectedOption= "".toCharArray();
                switch (randomNumber) {
                    case 0:
                        selectedOption = (story);
                        break;
                    case 1:
                        selectedOption =(story2);
                        break;
                    case 2:
                        selectedOption =(story3);
                        break;
            }
                outputText.setText(String.valueOf(selectedOption));}
        });
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String story = outputText.getText().toString();
                String firstAnswer = firstChoice.getText().toString();
                String secondAnswer = secondChoice.getText().toString();
                String thirdAnswer = thirdChoice.getText().toString();
                String fourthAnswer = fourthChoice.getText().toString();
                String fifthAnswer = fifthChoice.getText().toString();
                String sixthAnswer = sixthChoice.getText().toString();
                String seventhAnswer = seventhChoice.getText().toString();
                String eighthAnswer = eighthChoice.getText().toString();

                story = story.replace("(1 - Place)", firstAnswer);
                story = story.replace("(2 - Adjective)", secondAnswer);
                story = story.replace("(3 - Animal)", thirdAnswer);
                story = story.replace("(4 - Verb ending in -ing)", fourthAnswer);
                story = story.replace("(5 - Day of the week)", fifthAnswer);
                story = story.replace("(6 - Name)", sixthAnswer);
                story = story.replace("(7 - Plural Noun)", seventhAnswer);
                story = story.replace("(8 - Adjective)", eighthAnswer);

                // For the other stories, you would also include the replacements for those specific placeholders.

                outputText.setText(story);
            }
        });
        }



            }
