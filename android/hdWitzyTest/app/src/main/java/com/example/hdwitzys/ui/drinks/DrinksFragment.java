package com.example.hdwitzys.ui.drinks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hdwitzys.databinding.FragmentDrinksBinding;

public class DrinksFragment extends Fragment {

    private FragmentDrinksBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Create an instance of DrinksViewModel
        DrinksViewModel drinksViewModel =
                new ViewModelProvider(this).get(DrinksViewModel.class);

        binding = FragmentDrinksBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDrink;
        // Use the instance of DrinksViewModel to call getText()
        drinksViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
