package com.example.chatwithandfilmdiaryscreens.movies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;

public class MoviesViewHolder extends RecyclerView.ViewHolder {

    ImageView imageImg;
    TextView movieNameTxt;

    public MoviesViewHolder(@NonNull View itemView) {
        super(itemView);
        imageImg = itemView.findViewById(R.id.image_img);
        movieNameTxt = itemView.findViewById(R.id.movie_name_txt);
    }
}
