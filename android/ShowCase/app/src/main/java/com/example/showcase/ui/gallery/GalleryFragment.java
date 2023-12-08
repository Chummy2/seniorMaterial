package com.example.showcase.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.showcase.R;

import java.util.Random;

public class GalleryFragment extends Fragment {

    private EditText[] choiceInputs;
    private Button[] storyButtons;
    private TextView outputText;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        initializeUI(root);
        setupListeners(root);

        return root;
    }

    private void initializeUI(View root) {
        choiceInputs = new EditText[]{
                root.findViewById(R.id.firstChoice),
                root.findViewById(R.id.secondChoice),
                root.findViewById(R.id.thirdChoice),
                root.findViewById(R.id.fourthChoice),
                root.findViewById(R.id.fifthChoice),
                root.findViewById(R.id.sixthChoice),
                root.findViewById(R.id.seventhChoice),
                root.findViewById(R.id.eighthChoice)
        };

        storyButtons = new Button[]{
                root.findViewById(R.id.firstStory),
                root.findViewById(R.id.secondStory),
                root.findViewById(R.id.thirdStory),
                root.findViewById(R.id.randomStory)
        };

        outputText = root.findViewById(R.id.outputText);
    }

    private void setupListeners(View root) {
        for (Button button : storyButtons) {
            button.setOnClickListener(this::onStoryButtonClick);
        }

        root.findViewById(R.id.enterButton).setOnClickListener(this::onEnterButtonClick);
        root.findViewById(R.id.resetButton).setOnClickListener(this::onResetButtonClick);
    }

    private void onStoryButtonClick(View view) {
        String[] stories = getStories();
        int viewId = view.getId();

        outputText.setVisibility(View.VISIBLE);

        if (viewId == R.id.firstStory) {
            outputText.setText(stories[0]);
        } else if (viewId == R.id.secondStory) {
            outputText.setText(stories[1]);
        } else if (viewId == R.id.thirdStory) {
            outputText.setText(stories[2]);
        } else if (viewId == R.id.randomStory) {
            Random random = new Random();
            outputText.setText(stories[random.nextInt(stories.length)]);
        }
    }

    private void onEnterButtonClick(View view) {
        String story = outputText.getText().toString();
        for (int i = 0; i < choiceInputs.length; i++) {
            String replacement = "(" + (i + 1) + " - " + getPlaceholderName(i) + ")";
            story = story.replace(replacement, choiceInputs[i].getText().toString());
            choiceInputs[i].setVisibility(View.GONE);
        }
        outputText.setText(story);
        outputText.setVisibility(View.VISIBLE);
        for (Button button : storyButtons) {
            button.setEnabled(false);
        }
    }

    private void onResetButtonClick(View view) {
        for (EditText editText : choiceInputs) {
            editText.setText("");
            editText.setVisibility(View.VISIBLE);
        }
        outputText.setText("");
        outputText.setVisibility(View.GONE);

        // Reset the story selection
        for (Button button : storyButtons) {
            button.setEnabled(true);
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
            default: return "";
        }
    }
}
