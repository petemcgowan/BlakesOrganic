package com.buachaillmaith.blakesorganicandroid.ui.history;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import com.buachaillmaith.blakesorganicandroid.R;
import com.buachaillmaith.blakesorganicandroid.databinding.FragmentHistoryBinding;
import com.buachaillmaith.blakesorganicandroid.ui.*;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.buachaillmaith.blakesorganicandroid.ui.ItemClickListener;

public class HistoryFragment extends Fragment implements ItemClickListener {

    private FragmentHistoryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHistoryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        if (Constants.historyList.size() == 0)
            populateHistory();  // Ensure populateHistory() is defined in your class

        binding.fbView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/BlakesOrganic/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        binding.igView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/blakesalwaysorganic/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        binding.wbView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://blakesalwaysorganic.ie/online-shop/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(@NonNull Item item) {
//        val intent = Intent( activity, DetailActivity::class.java)
//        intent.putExtra(ITEM_ID_EXTRA, book.id)
//        startActivity(intent)
    }

    private void populateHistory() {
        Item book1 = new Item(
//            R.drawable.benefit3_bacteria_allv1,
                R.drawable.history_organic_coffee_beans,
                "The company is focused only on certified Organic produce.",
                "Blake’s Always Organic is based in The Food Hub, Drumshanbo, Co. Leitrim since 2012",
                "Desc",
                "H1",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.historyList.add(book1);

        Item book2 = new Item(
//            R.drawable.benefit3_bacteria_allv1,
                R.drawable.history_lough_leitrim_boardwalk,
                "Our current products are Organic Kefir, (a probiotic health drink for gut revitalisation made with whole organic milk.) and Whole-bean Artisan Organic coffees.\n",
                "Sean McGloin became aware of the health benefits of the fermented milk kefir and was making kefir for his family before developing the product on a small commercial scale.",
                "desc",
                "H2",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.historyList.add(book2);

        Item book3 = new Item(
//            R.drawable.benefit3_bacteria_allv1,
                R.drawable.history_lough_leitrim_small,
                "Kefir originates in the Caucasus mountains.",
                "Hundreds of years ago kefir was found high in the Caucasus mountains villages of nomadic shepherds who had abnormally good health.",
                "Desc",
                "H3",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.historyList.add(book3);

        Item book4 = new Item(
//            R.drawable.benefit3_bacteria_allv1,
                R.drawable.history_glencar_waterfall,
                "While half the world was dying of malnutrition and disease, these shepherds and their families lived long healthy lives with little or no disease.",
                "On further research, they discovered that part of the diet was a milk product that was stored in bags or containers made from calf stomachs.",
                "Desc",
                "H4",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.historyList.add(book4);

        Item book5 = new Item(
//            R.drawable.benefit3_bacteria_allv1,
                R.drawable.history_sheep_shepard,
                "As temperatures rose the natural bacteria in the wall of the calf’s stomach bag impregnated the milk causing fermentation resulting in billions of good bacteria that was regular drank by the shepherds to achieve good health.",
                "In 2016, Blakes Always Organic commenced selling “Feel Good” Organic Kefir.",
                "Desc",
                "H5",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.historyList.add(book5);

        Item book6 = new Item(
//            R.drawable.benefit3_bacteria_allv1,
                R.drawable.history_wooden_850_vat,
                "Starting off, we made batches of kefir in a small 20 litre Bain Marie, which we bottled and labelled by hand.",
                "We had to move to a 200 litre vat within 3 months and in 2018 we had to purchase a 850 litre vat.",
                "Desc",
                "H6",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.historyList.add(book6);

        Item book7 = new Item(
//            R.drawable.benefit3_bacteria_allv1,
                R.drawable.kefir_in_fridge_blakes_organic,
                "We currently produce around 1600 litres per week. The product proved to be very popular with our health conscious customers.\n",
                "Three years later, and our production scale has grown continuously to cater for the increasing demand as the undisputed health benefits of milk kefir is the main driver of sales.",
                "Desc",
                "H7",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.historyList.add(book7);
    }

}