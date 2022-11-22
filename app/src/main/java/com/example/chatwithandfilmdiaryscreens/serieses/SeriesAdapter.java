package com.example.chatwithandfilmdiaryscreens.serieses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesViewHolder> {

    ArrayList<Series> serieses;

    public void setData(ArrayList<Series> seriesList) {
        serieses = seriesList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.serieses_item, parent, false);
        SeriesViewHolder seriesViewHolder = new SeriesViewHolder(view);
        return seriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
        Series series = serieses.get(position);
        holder.seriesNameTxt.setText(series.title);
        Picasso.get().load(series.imageUrl).into(holder.imageImg);
    }

    @Override
    public int getItemCount() {
        return serieses.size();
    }
}
