package com.buachaillmaith.blakesorganicandroid.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.buachaillmaith.blakesorganicandroid.databinding.MiniCardCellBinding;
import java.util.List;

public class MiniCardAdapter extends RecyclerView.Adapter<MiniCardViewHolder> {
    private List<Item> books;
    private ItemClickListener clickListener;

    public MiniCardAdapter(List<Item> books, ItemClickListener clickListener) {
        this.books = books;
        this.clickListener = clickListener;
    }

    @Override
    public MiniCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        MiniCardCellBinding binding = MiniCardCellBinding.inflate(from, parent, false);
        return new MiniCardViewHolder(binding, clickListener);
    }

    @Override
    public void onBindViewHolder(MiniCardViewHolder holder, int position) {
        holder.bindBook(books.get(position));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
