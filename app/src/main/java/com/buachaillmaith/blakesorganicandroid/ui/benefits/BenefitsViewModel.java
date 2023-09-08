package com.buachaillmaith.blakesorganicandroid.ui.benefits;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BenefitsViewModel extends ViewModel {
    private final MutableLiveData<String> _text;

    public BenefitsViewModel() {
        this._text = new MutableLiveData<>();
        this._text.setValue("This is Stockists Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
