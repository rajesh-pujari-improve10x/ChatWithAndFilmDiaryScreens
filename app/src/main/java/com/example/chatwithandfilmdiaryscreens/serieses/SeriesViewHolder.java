package com.example.chatwithandfilmdiaryscreens.serieses;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;

public class SeriesViewHolder extends RecyclerView.ViewHolder {

    ImageView imageImg;
    TextView seriesNameTxt;

    public SeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        imageImg = itemView.findViewById(R.id.image_img);
        seriesNameTxt =itemView.findViewById(R.id.series_name_txt);
    }
}
