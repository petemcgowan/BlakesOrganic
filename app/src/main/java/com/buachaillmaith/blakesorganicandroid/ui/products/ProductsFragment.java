package com.buachaillmaith.blakesorganicandroid.ui.products;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.buachaillmaith.blakesorganicandroid.R;
import com.buachaillmaith.blakesorganicandroid.databinding.FragmentProductsBinding;
import com.buachaillmaith.blakesorganicandroid.ui.*;
import com.google.android.gms.maps.model.LatLng;
import com.buachaillmaith.blakesorganicandroid.ui.Constants;

public class ProductsFragment extends Fragment implements ItemClickListener {

    private FragmentProductsBinding _binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        _binding = FragmentProductsBinding.inflate(inflater, container, false);
        View root = _binding.getRoot();

        if (Constants.productList.size() == 0)
            populateProducts();

        _binding.recyclerview.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        _binding.recyclerview.setAdapter(new MiniCardAdapter(Constants.productList, this));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        _binding = null;
    }

    @Override
    public void onClick(Item book) {
        Intent intent = new Intent(getActivity(), ProductDetailActivity.class);
        intent.putExtra(Constants.ITEM_ID_EXTRA, book.getId());
        startActivity(intent);
    }

    private void populateProducts()
    {
        Item product1 = new Item(
            R.drawable.product_sheebeg_cheese_upscayl_4x_realesrgan_x4plus,
            "Our Sheebeg Organic Raw Milk Irish made cheese is a strong cheddar type cheese, matured for 24-36 months here in The Food Hub, before being cut into 140g wedges for our customers\n",
            "Sheebeg Cheese", // longer description (the Detail activity)
            "• Matured • Irish • 140g ",
            "P1",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.productList.add(product1);

        Item product2 = new Item(
            R.drawable.product_blakes_culture_blend_scaled_upscayl_4x_ultrasharp,
            "Culture Blend is a blend of three Organic coffee beans designed to give our coffee a nice body, with low acidity, and a hint of sweetness. \n" +
                    "The main bean variety we use is an Arabica bean from Indonesia: Sumatra Mandheling Raja Gayo : The King of the Gayo Mountain. This gives our blend a nice smooth body. \n" +
                    "To this we add some Peruvian Arabica: HB Grade One, which gives our blend its sweetness and a hint of fruitiness. Then we add a small amount of a quality Asian Robusta for that extra kick of caffeine.\n" +
                    "\n" +
                    "After some experimental roasting and tastings to look at possible blending options, we are confident that this blend is something special.\n " +
                    "Finally, the first full roasting has been complete, the coffee pouched up and ready for sale, and the smell of freshly roasted coffee fills the air.\n" +
                    "\n" +
                    "We hope that you enjoy our Culture Blend coffee as much as we do…",
            "Culture Blend",
            "• Organic Blend • Peruvian • Indonesian \n",
            "P2",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.productList.add(product2);

        Item product3 = new Item(
            R.drawable.product_organic_pure_decaf_high_res_blakes_organic_upscayl_4x_ultrasharp,
            "Our Peru CO2 Decaf is made from only Peruvian 100% Organic Arabica coffee beans, using the CO2 decaffeination process. \n" +
                    "This process uses carbon dioxide to extract almost all of the caffeine from the beans without extracting the rich flavours that are found within the Peruvian Arabica coffee, (rather than being soaked out and then put back in as they do in both the indirect solvent or Swiss Water decaffeination processes).\n" +
                    "\n" +
                    "We then roast our coffee beans in small batches in Co. Leitrim. The resulting coffee is a medium-bodied, well balanced nutty-flavoured coffee with mild acidity and a hint of citrus zest. \n" +
                    "The coffee performs well as either an espresso coffee or with milk added.",
            "Peru CO2 Decaf",
            "• No caffeine • Peru • Medium-bodied ",
            "P3",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.productList.add(product3);

        Item product4 = new Item(
            R.drawable.product_purely_arabica_upscayl_4x_ultrasharp,
            "Feedback we received from coffee lovers indicated a demand for a blend with a milder caffeine boost. \n" +
                    "We investigated mixing decaffeinated beans with arabica beans to give a refreshing taste with less kick, but the composition of the decaffeinated coffee beans proved unworkable. \n" +
                    "We then experimented with South American beans, using the fruity, well-balanced Peruvian Arabica hard beans, blended with a rich flavoured Colombian Excelso Arabica. \n" +
                    "By not adding any Robusta to the blend, we reduced the caffeine kick.  The result is a mild, yet full-flavoured blend: A perfect after-dinner coffee.",
            "Purely Arabica",
            "• Peruvian Arabica • Colombian Excelso\n",
            "P4",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.productList.add(product4);

        Item product5 = new Item(
            R.drawable.product_how_do_you_drink_your_kefir,
            "Kefir is a yoghurt style drink, exceptionally rich in nutrients and probiotics, aiding digestion and providing excellent gut health.\n" +
                    "\n" +
                    "It is high in protein, calcium and vitamin D and tastes amazing too!",
            "Organic Milk Kefir",
            "• Natural • 750ml • 250ml",
            "P5",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.productList.add(product5);

        Item product6 = new Item(
            R.drawable.kefir_in_a_fridge_looking_cool_upscayl_4x_ultrasharp,
            "A 1 cup serving of low fat kefir contains:\n" +
                    "\n" +
                    "Protein: 9 grams\n" +
                    "Calcium: 24% of the daily value (DV)\n" +
                    "Phosphorus: 20% of the DV\n" +
                    "Vitamin B12: 29% of the DV\n" +
                    "Riboflavin (B2): 25% of the DV\n" +
                    "Magnesium: 7% of the DV\n" +
                    "Vitamin D: 12% of the DV\n" +
                    "In addition, kefir has about 104 calories, 11.6 grams of carbs, and 2–3 grams of fat, depending on the type of milk used.\n" +
                    "\n" +
                    "Kefir also contains a wide variety of bioactive compounds, including organic acids and peptides that contribute to its health benefits.\n" +
                    "\n" +
                    "Dairy-free versions of kefir can be made with coconut water, coconut milk, or other sweet liquids. These will not have the same nutrient profile as dairy-based kefir.",
            "Kefir 6-Pack",
            "• 104 cals • Bioactive • 6-Pack",
            "P6",
                new LatLng(53.34946379011656, -6.278325172177447)
        );
        Constants.productList.add(product6);
    }
}