package com.example.showcase.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.showcase.R;

import java.util.Random;

public class SlideshowFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        EditText firstETXT = root.findViewById(R.id.firstEditText);
        EditText lastETXT = root.findViewById(R.id.lastEditText);
        EditText cityETXT = root.findViewById(R.id.cityEditText);
        EditText schoolETXT = root.findViewById(R.id.schoolEditText);
        EditText petTEXT = root.findViewById(R.id.petEditText);
        EditText siblingETXT = root.findViewById(R.id.siblingEditText);
        Button generateBTN = root.findViewById(R.id.button2);
        TextView outputTXT = root.findViewById(R.id.textView13);

        generateBTN.setOnClickListener(view -> {
            Random randy = new Random();
            String first = String.valueOf(firstETXT.getText());
            String last = String.valueOf(lastETXT.getText());
            String city = String.valueOf(cityETXT.getText());
            String school = String.valueOf(schoolETXT.getText());
            String pet = String.valueOf(petTEXT.getText());
            String sibling = String.valueOf(siblingETXT.getText());

            int firstPortion = randy.nextInt(first.length());
            int lastPortion = randy.nextInt(last.length());
            String scifiFirst = first.substring(0, firstPortion) + last.substring(0, lastPortion);
            firstPortion = randy.nextInt(city.length());
            lastPortion = randy.nextInt(school.length());
            String scifiLast = city.substring(0, firstPortion) + school.substring(0, lastPortion);
            firstPortion = randy.nextInt(pet.length());
            lastPortion = randy.nextInt(sibling.length());
            String scifiOrigin = pet.substring(0, firstPortion) + sibling.substring(0, lastPortion);
            outputTXT.setText(scifiFirst + " " + scifiLast + " of the planet " + scifiOrigin);
        });

        return root;
    }
}
