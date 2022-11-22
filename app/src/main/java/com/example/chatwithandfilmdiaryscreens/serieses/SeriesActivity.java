package com.example.chatwithandfilmdiaryscreens.serieses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chatwithandfilmdiaryscreens.R;

import java.util.ArrayList;

public class SeriesActivity extends AppCompatActivity {

    public ArrayList<Series> serieses;
    public RecyclerView seriesesRv;
    public SeriesAdapter seriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        getSupportActionBar().setTitle("Series");
        setupSeries();
        setupSeriesesRv();
    }

    public void setupSeries() {
        serieses = new ArrayList<>();
        Series firstMovie = new Series();
        firstMovie.imageUrl = "https://occ-0-1556-1007.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABduFRBhx6t-Dhqq_nz4teWtFQs7rpEnkYggmaKnJ1jjtbaGGqVSTZi1OfHu6DkmLzO7d5bXlhKYE1Eu6jrJoaO64l0uKJY2YEHJb.jpg?r=109";
        firstMovie.title = "Kung Fu Panda Movie Series";
        serieses.add(firstMovie);

        Series secondMovie = new Series();
        secondMovie.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/3/36/Harry-potter-films.png/revision/latest/scale-to-width-down/1000?cb=20110722151247";
        secondMovie.title = "Harry Potter Movie Series";
        serieses.add(secondMovie);
    }

    public void setupSeriesesRv() {
        seriesesRv = findViewById(R.id.series_rv);
        seriesesRv.setLayoutManager(new LinearLayoutManager(this));
        seriesAdapter = new SeriesAdapter();
        seriesAdapter.setData(serieses);
        seriesesRv.setAdapter(seriesAdapter);
    }
}