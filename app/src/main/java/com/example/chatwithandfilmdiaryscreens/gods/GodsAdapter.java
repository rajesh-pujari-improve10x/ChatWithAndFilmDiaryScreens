package com.example.chatwithandfilmdiaryscreens.gods;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GodsAdapter extends RecyclerView.Adapter<GodsViewHolder> {

    public ArrayList<God> gods;

    public void setData(ArrayList<God> godsList) {
        gods = godsList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GodsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gods_item, parent, false);
        GodsViewHolder godsViewHolder = new GodsViewHolder(view);
        return godsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GodsViewHolder holder, int position) {
        God god = gods.get(position);
        holder.godNameTxt.setText(god.title);
        Picasso.get().load(god.imageUrl).into(holder.godsViewImg);
    }

    @Override
    public int getItemCount() {
        return gods.size();
    }
}
