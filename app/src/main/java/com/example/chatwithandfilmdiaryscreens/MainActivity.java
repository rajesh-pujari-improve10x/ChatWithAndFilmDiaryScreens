package com.example.chatwithandfilmdiaryscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.chatwithandfilmdiaryscreens.advancedseries.AdvancedSeriesActivity;
import com.example.chatwithandfilmdiaryscreens.gods.GodsActivity;
import com.example.chatwithandfilmdiaryscreens.grocery.GroceryActivity;
import com.example.chatwithandfilmdiaryscreens.messages.MessagesActivity;
import com.example.chatwithandfilmdiaryscreens.movies.MoviesActivity;
import com.example.chatwithandfilmdiaryscreens.serieses.SeriesActivity;
import com.example.chatwithandfilmdiaryscreens.templates.TemplatesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handleTemplatesBtn();
        handleMessagesBtn();
        handleSeriesesBtn();
        handleMoviesesBtn();
        handleAdvancedSeriesBtn();
        handleGroceryBtn();
        handleGodBtn();
    }

    public void handleTemplatesBtn() {
        Button templatesBtn = findViewById(R.id.templates_btn);
        templatesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TemplatesActivity.class);
            startActivity(intent);
        });
    }

    public void handleMessagesBtn() {
        Button messagesBtn = findViewById(R.id.messages_btn);
        messagesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MessagesActivity.class);
            startActivity(intent);
        });
    }

    public void handleSeriesesBtn() {
        Button seriesesBtn = findViewById(R.id.serieses_btn);
        seriesesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SeriesActivity.class);
            startActivity(intent);
        });
    }

    public void handleMoviesesBtn() {
        Button moviesesBtn = findViewById(R.id.movieses_btn);
        moviesesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MoviesActivity.class);
            startActivity(intent);
        });
    }

    public void handleAdvancedSeriesBtn() {
        Button advancedSeriesBtn = findViewById(R.id.advanced_series_btn);
        advancedSeriesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdvancedSeriesActivity.class);
            startActivity(intent);
        });
    }

    public void handleGroceryBtn() {
        Button groceryBtn = findViewById(R.id.grocery_btn);
        groceryBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, GroceryActivity.class);
            startActivity(intent);
        });
    }

    public void handleGodBtn() {
        Button godsBtn = findViewById(R.id.gods_btn);
        godsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, GodsActivity.class);
            startActivity(intent);
        });
    }
}