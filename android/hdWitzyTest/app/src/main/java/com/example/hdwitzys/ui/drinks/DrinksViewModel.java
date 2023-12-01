package com.example.hdwitzys.ui.drinks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DrinksViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DrinksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is drinks fragment");
    }

    // Remove the static keyword
    public LiveData<String> getText() {
        return mText;
    }
}
