package com.buachaillmaith.blakesorganicandroid.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.buachaillmaith.blakesorganicandroid.databinding.CardCellBinding;
import android.view.View;

public class CardViewHolder extends RecyclerView.ViewHolder {
    private CardCellBinding cardCellBinding;
    private ItemClickListener clickListener;

    public CardViewHolder(CardCellBinding cardCellBinding, ItemClickListener clickListener) {
        super(cardCellBinding.getRoot());
        this.cardCellBinding = cardCellBinding;
        this.clickListener = clickListener;
    }

    public void bindBook(Item item) {
        cardCellBinding.cover.setImageResource(item.getCover());
        cardCellBinding.title.setText(item.getTitle());
        cardCellBinding.longDescription.setText(item.getDescription());

        cardCellBinding.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onClick(item);
            }
        });
    }
}
