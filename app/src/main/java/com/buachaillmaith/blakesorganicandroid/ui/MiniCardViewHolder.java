package com.buachaillmaith.blakesorganicandroid.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.buachaillmaith.blakesorganicandroid.databinding.MiniCardCellBinding;
import android.view.View;

public class MiniCardViewHolder extends RecyclerView.ViewHolder {
    private MiniCardCellBinding miniCardCellBinding;
    private ItemClickListener clickListener;

    public MiniCardViewHolder(MiniCardCellBinding miniCardCellBinding, ItemClickListener clickListener) {
        super(miniCardCellBinding.getRoot());
        this.miniCardCellBinding = miniCardCellBinding;
        this.clickListener = clickListener;
    }

    public void bindBook(final Item item) {
        miniCardCellBinding.cover.setImageResource(item.getCover());
        miniCardCellBinding.title.setText(item.getTitle());
        miniCardCellBinding.description.setText(item.getDescription());

        miniCardCellBinding.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClick(item);
            }
        });
    }
}
