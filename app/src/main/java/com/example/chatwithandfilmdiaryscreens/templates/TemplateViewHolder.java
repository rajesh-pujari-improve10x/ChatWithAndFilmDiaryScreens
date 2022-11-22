package com.example.chatwithandfilmdiaryscreens.templates;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;

public class TemplateViewHolder extends RecyclerView.ViewHolder {

    TextView messageTxtTxt;

    public TemplateViewHolder(@NonNull View itemView) {
        super(itemView);
        messageTxtTxt = itemView.findViewById(R.id.message_txt);
    }
}
