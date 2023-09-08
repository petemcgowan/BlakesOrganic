package com.buachaillmaith.blakesorganicandroid.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.buachaillmaith.blakesorganicandroid.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String productID = getIntent().getStringExtra(Constants.ITEM_ID_EXTRA);
        Item book = bookFromID(productID);
        if(book != null) {
            binding.cover.setImageResource(book.getCover());
            binding.title.setText(book.getTitle());
            binding.detailLongDescription.setText(book.getLongDescription());
        }
    }

    private Item bookFromID(String productID) {
        for(Item book : Constants.productList) {
        if(book.getId().equals(productID))
            return book;
    }
        return null;
    }
}
