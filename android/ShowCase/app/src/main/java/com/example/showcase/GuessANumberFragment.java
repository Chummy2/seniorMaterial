package com.example.showcase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.Random;

public class GuessANumberFragment extends Fragment {

    private int randomNumber;
    private int strikes;
    private int points; // Total points across all rounds
    private int currentRoundPoints; // Points in the current round

    public GuessANumberFragment() {
    }

    public static GuessANumberFragment newInstance() {
        return new GuessANumberFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_guess_a_number, container, false);

        EditText editTextNumber = rootView.findViewById(R.id.editTextNumber);
        TextView textViewHint = rootView.findViewById(R.id.textViewHint);
        TextView textViewStrikes = rootView.findViewById(R.id.textViewStrikes);
        TextView textViewPoints = rootView.findViewById(R.id.textViewPoints);

        rootView.findViewById(R.id.button).setOnClickListener(view -> onGuess(editTextNumber, textViewHint, textViewStrikes, textViewPoints));

        generateNewNumber(textViewStrikes, textViewPoints);

        return rootView;
    }

    private void generateNewNumber(TextView textViewStrikes, TextView textViewPoints) {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        strikes = 10;
        currentRoundPoints = 0;
        updateUI(textViewStrikes, textViewPoints);
    }

    private void onGuess(EditText editTextNumber, TextView textViewHint, TextView textViewStrikes, TextView textViewPoints) {
        int guessedNumber;
        try {
            guessedNumber = Integer.parseInt(editTextNumber.getText().toString());
        } catch (NumberFormatException e) {
            textViewHint.setText("Please enter a valid number.");
            return;
        }

        if (guessedNumber == randomNumber) {
            currentRoundPoints = 50 + 5 * strikes;
            points += currentRoundPoints;
            textViewHint.setText("Correct! You've earned " + currentRoundPoints + " points this round.");
            updateUI(textViewStrikes, textViewPoints);
            new android.os.Handler().postDelayed(() -> generateNewNumber(textViewStrikes, textViewPoints), 2000);
        } else {
            strikes--;
            if (strikes == 0) {
                textViewHint.setText("Game Over! The correct number was " + randomNumber + ". If you want to play again, pick another number and hit guess.");
                points = 0;
                currentRoundPoints = 0;
                generateNewNumber(textViewStrikes, textViewPoints);
            } else {
                String message = guessedNumber < randomNumber ? "Higher" : "Lower";
                textViewHint.setText(message + ". Strikes remaining: " + strikes);
                updateUI(textViewStrikes, textViewPoints);
            }
        }
    }

    private void updateUI(TextView textViewStrikes, TextView textViewPoints) {
        textViewStrikes.setText("Strikes: " + strikes);
        textViewPoints.setText("Points this round: " + currentRoundPoints + ". Total points: " + points);
    }
}
