package com.example.chatwithandfilmdiaryscreens.advancedseries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdvancedSeriesAdapter extends RecyclerView.Adapter<AdvancedSeriesViewHolder> {

    public ArrayList<AdvancedSeries> advancedSeriesList;

    public void setData(ArrayList<AdvancedSeries> advancedSeries) {
        this.advancedSeriesList = advancedSeries;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdvancedSeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advanced_series_item, parent, false);
        AdvancedSeriesViewHolder advancedSeriesViewHolder = new AdvancedSeriesViewHolder(view);
        return advancedSeriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdvancedSeriesViewHolder holder, int position) {
        AdvancedSeries advancedSeries = advancedSeriesList.get(position);
        holder.movieNameTxt.setText(advancedSeries.title);
        Picasso.get().load(advancedSeries.imageUrl).into(holder.moviesImg);
    }

    @Override
    public int getItemCount() {
        return advancedSeriesList.size();
    }
}
