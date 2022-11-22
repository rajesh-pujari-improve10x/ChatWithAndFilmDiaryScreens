package com.example.chatwithandfilmdiaryscreens.gods;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;

public class GodsViewHolder extends RecyclerView.ViewHolder {

    TextView godNameTxt;
    ImageView godsViewImg;

    public GodsViewHolder(@NonNull View itemView) {
        super(itemView);
        godNameTxt = itemView.findViewById(R.id.god_name_txt);
        godsViewImg = itemView.findViewById(R.id.gods_img);
    }
}
