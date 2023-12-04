package com.buachaillmaith.blakesorganicandroid.ui.stockists;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;

import com.buachaillmaith.blakesorganicandroid.R;
import com.buachaillmaith.blakesorganicandroid.databinding.FragmentStockistsBinding;
import com.buachaillmaith.blakesorganicandroid.ui.*;
import com.google.android.gms.maps.model.LatLng;
import com.buachaillmaith.blakesorganicandroid.ui.Constants;

public class StockistsFragment extends Fragment implements ItemClickListener {

    private FragmentStockistsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentStockistsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        if (Constants.stockistsList.size() == 0) {
            populateStockists();
        }

        binding.recyclerview.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        binding.recyclerview.setAdapter(new MiniCardAdapter(Constants.stockistsList, this));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(Item item) {
        Intent intent = new Intent(getActivity(), MapsActivity.class);
        intent.putExtra(Constants.ITEM_ID_EXTRA, item.getId());
        startActivity(intent);
    }


    private void populateStockists() {
        // Rua Cafe and Delicatessen
        Item stockistCafeRua = new Item(
                R.drawable.stockist_cafe_rua_upscayl_4x_realesrgan_x4plus,
                "Spencer St, Gorteendrunagh, Castlebar, Co. Mayo",  // address
                "Cafe Rua",   // name of stockist
                "Castlebar, Co. Mayo", //
                "S1",
                new LatLng(53.854600123239756, -9.296694191984217)
        );
        Constants.stockistsList.add(stockistCafeRua);

        // Shannon Fruit, Tullyvarraga
        Item stockistCosgroveSligo = new Item(
                R.drawable.stockist_shannon_fruit_upscayl_4x_realesrgan_x4plus,
                "Skycourt Shopping Centre, Tullyvarraga, Shannon, Co. Clare",  // address
                "Shannon Fruit",   // name of stockist
                "Shannon, Co. Clare", //
                "S2",
                new LatLng(54.3115881661309, -8.48392233856201)
        );
        Constants.stockistsList.add(stockistCosgroveSligo);

        // Donnybrook Fair, Dublin 4
        Item donnybrookFairDublin = new Item(
                R.drawable.stockist_donnybrook_fair_upscayl_4x_ultrasharp,
                "89 Morehampton Rd, Dublin 4",  // address
                "Donnybrook Fair",   // name of stockist
                "Dublin 4", //
                "S3",
                new LatLng(53.42417577807169, -6.259117650199059)
        );
        Constants.stockistsList.add(donnybrookFairDublin);

        // Morton's, Ranelagh, Dublin
        Item mortonsRanelagh = new Item(
                R.drawable.stockist_mortons_ranelagh_upscayl_4x_realesrgan_x4plus,
                "Ranelagh, Dublin",  // address
                "Morton's",   // name of stockist
                "Ranelagh, Dublin", //
                "S4",
                new LatLng(53.32118879912855, -6.2561448351287225)
        );
        Constants.stockistsList.add(mortonsRanelagh);

        // Cosgrove & Son, Abbeyquarter North
        Item cosgroveAbbeyquarter = new Item(
                R.drawable.stockist_cosgrove_sligo_upscayl_4x_realesrgan_x4plus,
                "32 Market St, Abbeyquarter North, Sligo",  // address
                "Cosgrove & Son",   // name of stockist
                "Abbeyquarter North, Sligo", //
                "S5",
                new LatLng(54.3115881661309, -8.48392233856201)
        );
        Constants.stockistsList.add(cosgroveAbbeyquarter);

        // Osta, Sligo
        Item ostaSligo = new Item(
                R.drawable.stockist_osta_sligo_upscayl_4x_ultrasharp,
                "Garavogue Weir, Stephen Street, Sligo",  // address
                "Osta",   // name of stockist
                "Stephen Street, Sligo", //
                "S6",
                new LatLng(54.308048664833024, -8.475682584134434)
        );
        Constants.stockistsList.add(ostaSligo);

        // Nature Health, Navan
        Item natureNavan = new Item(
                R.drawable.stockist_nature_navan2_upscayl_4x_realesrgan_x4plus,
                "Navan Shoppping Cantre, 1 Kennedy Rd, Navan",  // address
                "Nature Health",   // name of stockist
                "Navan Shoppping Cantre", //
                "S7",
                new LatLng(53.740982819774814, -6.684484786058696)
        );
        Constants.stockistsList.add(natureNavan);

        // Fresh, IFSC Dublin
        Item freshIfsc = new Item(
                R.drawable.stockist_fresh_ifsc,
                "Mayor Street Lower, Dublin",  // address
                "Fresh IFSC",   // name of stockist
                "Dublin", //
                "S8",
                new LatLng(53.44836580465253, -6.288247353275163)
        );
        Constants.stockistsList.add(freshIfsc);

        // Natures Gold, Dunboyne
        Item natureDunboyne = new Item(
                R.drawable.stockist_nature_dunboyne_upscayl_4x_realesrgan_x4plus,
                "Avoca, Dunboyne",  // address
                "Nature's Gold",   // name of stockist
                "Avoca, Dunboyne", //
                "S9",
                new LatLng(53.51819675385799, -6.50351556413804)
        );
        Constants.stockistsList.add(natureDunboyne);

        // Fresh, Rathfarnham
        Item freshRathfarnham = new Item(
                R.drawable.stockist_fresh_rathfarnham,
                "Rosemount Shopping Centre, Marian Road, Rathfarnham",  // address
                "Fresh Rathfarnham",   // name of stockist
                "Dublin", //
                "S10",
                new LatLng(53.37832487715894, -6.3209811838714245)
        );
        Constants.stockistsList.add(freshRathfarnham);

        // Boyne Valley Seafoods, Drogheda
        Item boyneDrogheda = new Item(
                R.drawable.stockist_boyne_drogheda_upscayl_4x_ultrasharp,
                "Southgate Shopping Centre, Drogheda",  // address
                "Boyne Valley Seafoods",   // name of stockist
                "Drogheda", //
                "S11",
                new LatLng(53.750632310076284, -6.316059084892225)
        );
        Constants.stockistsList.add(boyneDrogheda);

        // The Hopsack, Rathmines
        Item hopsackRathmines = new Item(
                R.drawable.stockist_hopsack_rathmines_upscayl_4x_realesrgan_x4plus,
                "The Swan Shopping Centre, Rathmines Road Lower",  // address
                "The Hopsack",   // name of stockist
                "Swan Shopping Centre", //
                "S12",
                new LatLng(53.41108056215478, -6.299161419926029)
        );
        Constants.stockistsList.add(hopsackRathmines);

        // Nature’s Gold, Rathcoole
        Item natureRathcoole = new Item(
                R.drawable.stockist_nature_rathcoole_upscayl_4x_realesrgan_x4plus,
                "Avoca Stores & cafe, Naas Road, Rathcoole",  // address
                "Nature’s Gold",   // name of stockist
                "Rathcoole", //
                "S13",
                new LatLng(53.35865936381066, -6.470818426724693)
        );
        Constants.stockistsList.add(natureRathcoole);

        // Fresh, Carrick On Shannon
        Item stockistFreshCarrick = new Item(
                R.drawable.stockist_fresh_carrick_upscayl_4x_realesrgan_x4plus,
                "7 Landmark Court, Carrick On Shannon",  // address
                "Fresh, Carrick",   // name of stockist
                "Carrick On Shannon", //
                "S14",
                new LatLng(53.96451231067534, -8.103642109125982)
        );
        Constants.stockistsList.add(stockistFreshCarrick);

        // Georges Fish Store, Stepaside
        Item georgeFishStore = new Item(
                R.drawable.stockist_georges_fish_store_upscayl_4x_realesrgan_x4plus,
                "18 Enniskerry Road, Stepaside",  // address
                "George's Fish Store",   // name of stockist
                "Stepaside, Dublin", //
                "S15",
                new LatLng(53.338984771408164, -6.243972400199067)
        );
        Constants.stockistsList.add(georgeFishStore);

        // Donnybrook Fair, Stillorgan
        Item donnybrookFairStillorgan = new Item(
                R.drawable.stockist_donnybrook_fair_stillorgan_upscayl_4x_ultrasharp,
                "47 - 49 Lower Kilmacud Road, Stillorgan Shopping Centre",  // address
                "Donnybrook Fair",   // name of stockist
                "Stillorgan", //
                "S16",
                new LatLng(53.36521554361809, -6.213881644417493)
        );
        Constants.stockistsList.add(donnybrookFairStillorgan);

        // Select Store, Dalkey
        Item selectDalkey = new Item(
                R.drawable.stockist_select_dalkey_upscayl_4x_realesrgan_x4plus,
                "1 Railway Rd, Dalkey",  // address
                "Select Store",   // name of stockist
                "Dalkey, Dublin", //
                "S17",
                new LatLng(53.355380895617344, -6.0752566573458004)
        );
        Constants.stockistsList.add(selectDalkey);

        // Nash 19 Restaurant, Cork
        Item nashCork = new Item(
                R.drawable.stockist_nash_cork,
                "19 Princes St, Cork City",  // address
                "Nash 19 Restaurant",   // name of stockist
                "Cork City", //
                "S18",
                new LatLng(51.99171950558138, -8.45278680100184)
        );
        Constants.stockistsList.add(nashCork);

        // Manna Organic Store, Island of Geese, Kerry
        Item mannaOrganic = new Item(
                R.drawable.stockist_manna_organic_upscayl_4x_ultrasharp,
                "Island of Geese, Kerry",  // address
                "Manna Organic Store",   // name of stockist
                "Island of Geese, Kerry", //
                "S19",
                new LatLng(52.269798115324036, -9.71046353172283)
        );
        Constants.stockistsList.add(mannaOrganic);

        // Simple Simons, Donegal
        Item simpleSimons = new Item(
                R.drawable.stockist_simple_simons_upscayl_4x_ultrasharp,
                "Donegal",  // address
                "Simple Simons",   // name of stockist
                "Donegal", //
                "S20",
                new LatLng(54.65393311182183, -8.107479944173482)
        );
        Constants.stockistsList.add(simpleSimons);

        // Between The Bridges, Enniskillen
        Item betweenTheBridges = new Item(
                R.drawable.stockist_between_the_bridges_upscayl_4x_realesrgan_x4plus,
                "Enniskillen",  // address
                "Between The Bridges",   // name of stockist
                "Enniskillen", //
                "S21",
                new LatLng(54.344555675048454, -7.638029229826629)
        );
        Constants.stockistsList.add(betweenTheBridges);

        // Fresh, Smithfield, Dublin
        Item freshSmithfield = new Item(
                R.drawable.stockist_fresh_smithfields,
                "Smithfield, Dublin",  // address
                "Fresh, Smithfield",   // name of stockist
                "Dublin", //
                "S22",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.stockistsList.add(freshSmithfield);

        // McCambridges, Galway
        Item stockistMcCambridges = new Item(
                R.drawable.stockist_mc_cambridges_galway_upscayl_4x_realesrgan_x4plus,
                "38/39 Shop Street, Galway",  // address
                "McCambridges",   // name of stockist
                "Galway", //
                "S23",
                new LatLng(53.2732505412702, -9.05247730628975)
        );
        Constants.stockistsList.add(stockistMcCambridges);
    }
}

