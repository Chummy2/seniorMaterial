package com.example.hdwitzys.ui.icecream;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IceCreamViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public IceCreamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ice cream fragment");
    }

    // Remove the static keyword to make this an instance method
    public LiveData<String> getText() {
        return mText;
    }
}
