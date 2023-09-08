package com.buachaillmaith.blakesorganicandroid.ui.products;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProductsViewModel extends ViewModel {

    private MutableLiveData<String> _text;

    public ProductsViewModel() {
        _text = new MutableLiveData<>();
        _text.setValue("This is products Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
