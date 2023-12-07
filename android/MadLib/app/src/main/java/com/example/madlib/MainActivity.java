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

        outputText.setVisibility(View.VISIBLE); // Make the TextView visible

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
        for (Button button : storyButtons) {
            button.setEnabled(false);
        }
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
                "In the bustling city of (1 - Place), a (2 - Adjective) (3 - Animal) was known for its unique talent of (4 - Verb ending in -ing). Every (5 - Day of the week), (6 - Name) would visit this (3 - Animal) with a bag of (7 - Plural Noun) to see its performance. \n" +
                        "One particular (5 - Day of the week), the (3 - Animal) decided to surprise (6 - Name) by wearing a(n) (8 - Adjective) costume and performing the most spectacular (4 - Verb ending in -ing) show ever seen in (1 - Place). \n" +
                        "The crowd cheered, and (6 - Name) realized it was not just an ordinary day but a(n) (2 - Adjective) adventure with the (3 - Animal), leaving everyone in (1 - Place) amazed and filled with joy.\n",

                "Deep in the heart of (1 - Place), there was a secret garden where a(n) (2 - Adjective) (3 - Animal) loved (4 - Verb ending in -ing). On this particular (5 - Day of the week), (6 - Name) stumbled upon this hidden paradise. \n" +
                        "Carrying a basket of (7 - Plural Noun), (6 - Name) was greeted by the (3 - Animal), who wore a(n) (8 - Adjective) crown. \n" +
                        "Together, they spent the day (4 - Verb ending in -ing) among the magical flora of (1 - Place). It was a(n) (2 - Adjective) day that (6 - Name) would never forget, filled with laughter and the enchanting presence of the (3 - Animal).",

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
