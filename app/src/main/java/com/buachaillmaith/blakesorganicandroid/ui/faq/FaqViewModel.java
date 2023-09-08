package com.buachaillmaith.blakesorganicandroid.ui.faq;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FaqViewModel extends ViewModel {

    private MutableLiveData<String> _text;

    public FaqViewModel() {
        _text = new MutableLiveData<>();
        _text.setValue("This is FAQ Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
