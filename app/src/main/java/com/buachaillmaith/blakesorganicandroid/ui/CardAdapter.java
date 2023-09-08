package com.buachaillmaith.blakesorganicandroid.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.buachaillmaith.blakesorganicandroid.databinding.CardCellBinding;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<Item> books;
    private ItemClickListener clickListener;

    public CardAdapter(List<Item> books, ItemClickListener clickListener) {
        this.books = books;
        this.clickListener = clickListener;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        CardCellBinding binding = CardCellBinding.inflate(from, parent, false);
        return new CardViewHolder(binding, clickListener);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.bindBook(books.get(position));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
