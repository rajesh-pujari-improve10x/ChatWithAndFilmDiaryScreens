package com.example.chatwithandfilmdiaryscreens.templates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwithandfilmdiaryscreens.R;

import java.util.ArrayList;

public class TemplateAdapter extends RecyclerView.Adapter<TemplateViewHolder> {

    public ArrayList<Template> templates;

    public void setData(ArrayList<Template> templatesList) {
        templates = templatesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TemplateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item, parent, false);
        TemplateViewHolder templateViewHolder = new TemplateViewHolder(view);
        return templateViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TemplateViewHolder holder, int position) {
        Template template = templates.get(position);
        holder.messageTxtTxt.setText(template.messageTxt);
    }

    @Override
    public int getItemCount() {
        return templates.size();
    }
}
