package com.example.madlib;

import static com.example.madlib.R.*;
import static com.example.madlib.R.id.*;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText[] choiceInputs;
    private Button[] storyButtons;
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        initializeUI();
        setupListeners();
    }

    private void initializeUI() {
        choiceInputs = new EditText[]{
                findViewById(id.firstChoice),
                findViewById(id.secondChoice),
                findViewById(id.thirdChoice),
                findViewById(id.fourthChoice),
                findViewById(id.fifthChoice),
                findViewById(id.sixthChoice),
                findViewById(id.seventhChoice),
                findViewById(id.eighthChoice)
        };

        storyButtons = new Button[]{
                findViewById(id.firstStory),
                findViewById(id.secondStory),
                findViewById(id.thirdStory),
                findViewById(id.randomStory)
        };

        outputText = findViewById(id.outputText);
    }

    private void setupListeners() {
        for (Button button : storyButtons) {
            button.setOnClickListener(this::onStoryButtonClick);
        }

        findViewById(id.enterButton).setOnClickListener(this::onEnterButtonClick);
        findViewById(id.resetButton).setOnClickListener(this::onResetButtonClick);
    }

    private void onStoryButtonClick(View view) {
        String[] stories = getStories();
        int viewId = view.getId();

        if (viewId == id.firstStory) {
            outputText.setText(stories[0]);
        } else if (viewId == id.secondStory) {
            outputText.setText(stories[1]);
        } else if (viewId == id.thirdStory) {
            outputText.setText(stories[2]);
        } else if (viewId == id.randomStory) {
            Random random = new Random();
            outputText.setText(stories[random.nextInt(stories.length)]);
        }
    }

    private void onEnterButtonClick(View view) {
        String story = outputText.getText().toString();
        for (int i = 0; i < choiceInputs.length; i++) {
            String replacement = "(" + (i + 1) + " - " + getPlaceholderName(i) + ")";
            story = story.replace(replacement, choiceInputs[i].getText().toString());
            choiceInputs[i].setVisibility(View.GONE); // Hide the EditText
        }
        outputText.setText(story);
        outputText.setVisibility(View.VISIBLE); // Show the TextView
    }

    private void onResetButtonClick(View view) {
        for (EditText editText : choiceInputs) {
            editText.setText("");
            editText.setVisibility(View.VISIBLE); // Show the EditText
        }
        outputText.setText("");
        outputText.setVisibility(View.GONE); // Hide the TextView

        // Reset the story selection
        for (Button button : storyButtons) {
            button.setEnabled(true); // Re-enable the story buttons if they were disabled
        }
    }


    private String[] getStories() {
        return new String[] {
                "Once upon a time, in a (1 - Place) far, far away, there lived a(n) (2 - Adjective) (3 - Animal). This (3 - Animal) had a peculiar habit of (4 - Verb ending in -ing) all day long.\n" +
                        "One sunny (5 - Day of the week), (6 - Name) decided to pay a visit to this unusual creature. (6 - Name) brought a basket filled with (7 - Plural Noun) and a(n) (8 - Adjective) hat.\n" +
                        "As soon as (6 - Name) arrived at the (1 - Place), the (3 - Animal) stopped (4 - Verb ending in -ing) and looked up with (8 - Adjective) eyes. It seemed that the (3 - Animal) was in dire need of some (7 - Plural Noun).\n" +
                        "After sharing the (7 - Plural Noun) with the (3 - Animal), (6 - Name) and the (3 - Animal) spent the rest of the (5 - Day of the week) (4 - Verb ending in -ing) together. It turned out to be a(n) (2 - Adjective) day filled with laughter and (8 - Adjective) adventures.\n" +
                        "And so, (6 - Name) and the (3 - Animal) became the best of friends, and they continued to have (2 - Adjective) days at the (1 - Place) for years to come.\n",

                "One fine day, in the heart of (1 - Place), a(n) (2 - Adjective) (3 - Animal) was discovered (4 - Verb ending in -ing) around. It was a beautiful (5 - Day of the week), and (6 - Name) decided to explore this magical land.\n" +
                        "Armed with a backpack filled with (7 - Plural Noun) and wearing a(n) (8 - Adjective) hat, (6 - Name) set off on a grand adventure. Little did they know that (1 - Place) held many surprises, and their journey would lead to unforgettable encounters and (2 - Adjective) discoveries.\n" +
                        "As (6 - Name) ventured deeper into (1 - Place), they encountered (3 - Animal) of all shapes and sizes. Each (3 - Animal) had its own unique way of (4 - Verb ending in -ing), making the day even more (8 - Adjective).\n" +
                        "With their newfound friends, (6 - Name) explored the hidden wonders of (1 - Place) and created memories that would last a lifetime. And so, the adventure in (1 - Place) became a cherished tale, filled with (7 - Plural Noun) and (2 - Adjective) moments.\n",

                "On a (2 - Adjective) (5 - Day of the week), (6 - Name) was at the (1 - Place) (4 - Verb ending in -ing) when a (3 - Animal) suddenly appeared. It wasn't just any (3 - Animal), but one that was carrying a bag full of (7 - Plural Noun). Intrigued, (6 - Name) approached the creature. To their surprise, the bag was (8 - Adjective), and that changed their entire day!\n"
        };
    }



    private String getPlaceholderName(int index) {
        switch (index) {
            case 0: return "Place";
            case 1: return "Adjective";
            case 2: return "Animal";
            case 3: return "Verb ending in -ing";
            case 4: return "Day of the week";
            case 5: return "Name";
            case 6: return "Plural Noun";
            case 7: return "Adjective";
            default: return ""; // Fallback for unknown index
        }
    }

}
