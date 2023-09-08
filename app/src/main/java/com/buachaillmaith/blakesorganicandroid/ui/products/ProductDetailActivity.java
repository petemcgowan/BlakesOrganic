package com.buachaillmaith.blakesorganicandroid.ui.products;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.buachaillmaith.blakesorganicandroid.databinding.ActivityDetailBinding;
import com.buachaillmaith.blakesorganicandroid.ui.Item;
import com.buachaillmaith.blakesorganicandroid.ui.Constants;

public class ProductDetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String productID = getIntent().getStringExtra(Constants.ITEM_ID_EXTRA);
        Item product = productFromID(productID);
        if (product != null) {
            binding.cover.setImageResource(product.getCover());
            binding.title.setText(product.getTitle());
            binding.detailLongDescription.setText(product.getLongDescription());
        }
    }

    private Item productFromID(String productID) {
        for (Item product : Constants.productList) {
        if (product.getId().equals(productID))
            return product;
    }
        return null;
    }
}
