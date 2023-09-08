package com.buachaillmaith.blakesorganicandroid.ui.stockists;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StockistsViewModel extends ViewModel {

    private MutableLiveData<String> _text;

    public StockistsViewModel() {
        _text = new MutableLiveData<>();
        _text.setValue("This is Stockists Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
