package com.buachaillmaith.blakesorganicandroid.ui.stockists;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.buachaillmaith.blakesorganicandroid.R;
import com.buachaillmaith.blakesorganicandroid.databinding.ActivityMapsBinding;
import com.buachaillmaith.blakesorganicandroid.ui.Item;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.buachaillmaith.blakesorganicandroid.ui.Constants;


public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private Item localStockist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Pete's item retrieval Code
        String stockistID = getIntent().getStringExtra(Constants.ITEM_ID_EXTRA);

        Log.d("Stockists", stockistID);
        Item stockist = stockistFromID(stockistID);
        Log.d("Stockists", String.valueOf(stockist));
        if (stockist != null) {
            localStockist = stockist;
        }
        ;

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private Item stockistFromID(String productID) {
        for (Item stockist : Constants.stockistsList) {
            if (stockist.getId().equals(productID))
                return stockist;
        }
        return null;
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add stockist location markers...

        // Rua Cafe and Delicatessen
        LatLng ruaCafe = new LatLng(53.854600123239756, -9.296694191984217);
        mMap.addMarker(new MarkerOptions().position(ruaCafe).title("Rua Cafe and Delicatessen"));

        // McCambridges, Galway
        LatLng mcCambridgesGalway = new LatLng(53.2732505412702, -9.05247730628975);
        mMap.addMarker(new MarkerOptions().position(mcCambridgesGalway).title("McCambridges, Galway"));

        // Fresh, Carrick On Shannon
        LatLng freshCarrick = new LatLng(53.96451231067534, -8.103642109125982);
        mMap.addMarker(new MarkerOptions().position(freshCarrick).title("Fresh, Carrick On Shannon"));

        // Shannon Fruit, Tullyvarraga
        LatLng shannonTullyvarraga = new LatLng(52.762242561973466, -8.890905442532103);
        mMap.addMarker(new MarkerOptions().position(shannonTullyvarraga).title("Shannon Fruit, Tullyvarraga"));

        // Cosgrove & Son, Abbeyquarter North
        LatLng cosgroveAbbeyquarter = new LatLng(54.3115881661309, -8.48392233856201);
        mMap.addMarker(new MarkerOptions().position(cosgroveAbbeyquarter).title("Cosgrove & Son, Abbeyquarter North"));

        // Osta, Sligo
        LatLng ostaSligo = new LatLng(54.308048664833024, -8.475682584134434);
        mMap.addMarker(new MarkerOptions().position(ostaSligo).title("Osta, Sligo"));

        // Nature Health, Navan
        LatLng natureNavan = new LatLng(53.740982819774814, -6.684484786058696);
        mMap.addMarker(new MarkerOptions().position(natureNavan).title("Nature Health, Navan"));

        // Natures Gold, Dunboyne
        LatLng natureDunboyne = new LatLng(53.51819675385799, -6.50351556413804);
        mMap.addMarker(new MarkerOptions().position(natureDunboyne).title("Nature's Gold, Dunboyne"));

        // Nature’s Gold, Rathcoole
        LatLng natureRathcoole = new LatLng(53.35865936381066, -6.470818426724693);
        mMap.addMarker(new MarkerOptions().position(natureRathcoole).title("Nature’s Gold, Rathcoole"));

        // Fresh, Rathfarnham
        LatLng freshRathfarnham = new LatLng(53.37832487715894, -6.3209811838714245);
        mMap.addMarker(new MarkerOptions().position(freshRathfarnham).title("Fresh, Rathfarnham"));

        // Boyne Valley Seafoods, Drogheda
        LatLng boyneDrogheda = new LatLng(53.750632310076284, -6.316059084892225);
        mMap.addMarker(new MarkerOptions().position(boyneDrogheda).title("Boyne Valley Seafoods, Drogheda"));

        // The Hopsack, Rathmines
        LatLng hopsackRathmines = new LatLng(53.41108056215478, -6.299161419926029);
        mMap.addMarker(new MarkerOptions().position(hopsackRathmines).title("The Hopsack, Rathmines"));

        // Fresh, IFSC Dublin
        LatLng freshIfsc = new LatLng(53.44836580465253, -6.288247353275163);
        mMap.addMarker(new MarkerOptions().position(freshIfsc).title("Fresh, IFSC Dublin"));

        // Donnybrook Fair, Dublin 4
        LatLng donnybrookFairDublin = new LatLng(53.42417577807169, -6.259117650199059);
        mMap.addMarker(new MarkerOptions().position(donnybrookFairDublin).title("Donnybrook Fair, Dublin 4"));

        // Georges Fish Store, Stepaside
        LatLng georgeFishStore = new LatLng(53.338984771408164, -6.243972400199067);
        mMap.addMarker(new MarkerOptions().position(georgeFishStore).title("Georges Fish Store, Stepaside"));

        // Donnybrook Fair, Stillorgan
        LatLng donnybrookStillorgan = new LatLng(53.36521554361809, -6.213881644417493);
        mMap.addMarker(new MarkerOptions().position(donnybrookStillorgan).title("Donnybrook Fair, Stillorgan"));

        // Select Store, Dalkey
        LatLng selectDalkey = new LatLng(53.355380895617344, -6.0752566573458004);
        mMap.addMarker(new MarkerOptions().position(selectDalkey).title("Select Store, Dalkey"));

        // Nash 19 Restaurant, Cork
        LatLng nashCork = new LatLng(51.99171950558138, -8.45278680100184);
        mMap.addMarker(new MarkerOptions().position(nashCork).title("Nash 19 Restaurant, Cork"));

        // Manna Organic Store, Island of Geese, Kerry
        LatLng mannaOrganic = new LatLng(52.269798115324036, -9.71046353172283);
        mMap.addMarker(new MarkerOptions().position(mannaOrganic).title("Manna Organic Store, Island of Geese, Kerry"));

        // Simple Simons, Donegal
        LatLng simpleSimons = new LatLng(54.65393311182183, -8.107479944173482);
        mMap.addMarker(new MarkerOptions().position(simpleSimons).title("Simple Simons, Donegal"));

        // Between The Bridges, Enniskillen
        LatLng betweenTheBridges = new LatLng(54.344555675048454, -7.638029229826629);
        mMap.addMarker(new MarkerOptions().position(betweenTheBridges).title("Between The Bridges, Enniskillen"));

        // Fresh, Smithfield, Dublin
        LatLng freshSmithfield = new LatLng(53.34946379011656, -6.278325172177447);
        mMap.addMarker(new MarkerOptions().position(freshSmithfield).title("Fresh, Smithfield, Dublin"));

        // Morton's, Ranelagh, Dublin
        LatLng mortonsRanelagh = new LatLng(53.32118879912855, -6.2561448351287225);
        mMap.addMarker(new MarkerOptions().position(mortonsRanelagh).title("Morton's, Ranelagh, Dublin"));

        float zoomLevel = 14.0f; //This goes up to 21
        Log.d("localStockist:", localStockist.toString());
        mMap.getUiSettings().setZoomControlsEnabled(true);
        // Move the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(localStockist.getLatLng(), zoomLevel));
//        mMap.moveCamera(CameraUpdateFactory.zoomTo(5f))
    }
}