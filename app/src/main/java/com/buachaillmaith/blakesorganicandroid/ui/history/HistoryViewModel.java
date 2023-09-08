package com.buachaillmaith.blakesorganicandroid.ui.history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HistoryViewModel extends ViewModel {

    private MutableLiveData<String> _text;

    public HistoryViewModel() {
        _text = new MutableLiveData<>();
        _text.setValue("This is History Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
