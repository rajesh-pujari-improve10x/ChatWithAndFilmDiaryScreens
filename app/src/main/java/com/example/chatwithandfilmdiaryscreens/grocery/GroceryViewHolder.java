package com.example.chatwithandfilmdiaryscreens.grocery;

import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    ImageView groceryImg;
    TextView itemNameTxt;

    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        groceryImg = itemView.findViewById(R.id.grocery_img);
        itemNameTxt = itemView.findViewById(R.id.item_name_txt);
    }
}
