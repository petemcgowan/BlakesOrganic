package com.buachaillmaith.blakesorganicandroid.ui.benefits;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.buachaillmaith.blakesorganicandroid.databinding.ActivityDetailBinding;
import com.buachaillmaith.blakesorganicandroid.ui.DetailActivity;
import com.buachaillmaith.blakesorganicandroid.ui.Item;
import com.buachaillmaith.blakesorganicandroid.ui.Constants;

public class BenefitDetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String benefitID = getIntent().getStringExtra(Constants.ITEM_ID_EXTRA);
        Item benefit = benefitFromID(benefitID);
        if (benefit != null) {
            binding.cover.setImageResource(benefit.getCover());
            binding.title.setText(benefit.getTitle());
            binding.detailLongDescription.setText(benefit.getLongDescription());
        }
    }

    private Item benefitFromID(String benefitID) {
        for (Item benefit : Constants.benefitsList) {
            if (benefit.getId().equals(benefitID)) {
                return benefit;
            }
        }
        return null;
    }
}
