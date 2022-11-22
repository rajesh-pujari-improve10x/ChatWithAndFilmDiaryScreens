package com.example.chatwithandfilmdiaryscreens.advancedseries;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;

public class AdvancedSeriesViewHolder extends RecyclerView.ViewHolder {

    ImageView moviesImg;
    TextView movieNameTxt;

    public AdvancedSeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        moviesImg = itemView.findViewById(R.id.movies_img);
        movieNameTxt = itemView.findViewById(R.id.movie_name_txt);
    }
}
