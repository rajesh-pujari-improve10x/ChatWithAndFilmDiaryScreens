package com.example.chatwithandfilmdiaryscreens.advancedseries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chatwithandfilmdiaryscreens.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdvancedSeriesActivity extends AppCompatActivity {

    public ArrayList<AdvancedSeries> advancedSeriesList;
    public RecyclerView advancedSeriesRv;
    public AdvancedSeriesAdapter advancedSeriesAdapter;
    public TextView seriesNameTxt;
    public ImageView seriesImg;
    public AdvancedSeries advancedSeries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_series);
        getSupportActionBar().setTitle("Series");
        setupAdvancedSeriesList();
        setAdvancedSeriesRv();
        seriesNameTxt = findViewById(R.id.series_name_txt);
        seriesNameTxt.setText("Harry Potter");
        advancedSeriesList = new ArrayList<>();
        advancedSeries = new AdvancedSeries();
        advancedSeries.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/3/36/Harry-potter-films.png/revision/latest/scale-to-width-down/1000?cb=20110722151247";
        seriesImg = findViewById(R.id.series_img_img);
        Picasso.get().load(advancedSeries.imageUrl).into(seriesImg);

    }

    public void setupAdvancedSeriesList() {
        advancedSeriesList = new ArrayList<>();
        AdvancedSeries firstMovie = new AdvancedSeries();
        firstMovie.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220";
        firstMovie.title = "Harry potter and the sorcerer's stone";
        advancedSeriesList.add(firstMovie);

        AdvancedSeries secondMovie = new AdvancedSeries();
        secondMovie.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        secondMovie.title = "Harry potter and chamber of secrets";
        advancedSeriesList.add(secondMovie);

        AdvancedSeries thirdMovie = new AdvancedSeries();
        thirdMovie.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
        thirdMovie.title = "Harry potter and the prisoner of azkaban";
        advancedSeriesList.add(thirdMovie);

        AdvancedSeries fourthMovie = new AdvancedSeries();
        fourthMovie.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        fourthMovie.title = "Harry potter and the goblet of fire";
        advancedSeriesList.add(fourthMovie);

        AdvancedSeries fifthMovie = new AdvancedSeries();
        fifthMovie.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        fifthMovie.title = "Harry potter and the sorcerer's stone";
        advancedSeriesList.add(fifthMovie);

        AdvancedSeries sixthMovie = new AdvancedSeries();
        sixthMovie.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg";
        sixthMovie.title = "Harry potter and the sorcerer's stone";
        advancedSeriesList.add(sixthMovie);

        AdvancedSeries seventhMovie = new AdvancedSeries();
        seventhMovie.imageUrl = "https://images.moviesanywhere.com/de6092b467fc299fdf79a51dfa7f9710/12b877a3-28de-46ff-820f-dd8bf07e8edb.jpg";
        seventhMovie.title = "Harry potter and the deathly hallows: part 1";
        advancedSeriesList.add(seventhMovie);

        AdvancedSeries eighthMovie = new AdvancedSeries();
        eighthMovie.imageUrl = "https://images.moviesanywhere.com/5f0537520f90b687fc5db7f241affc4c/0280fd81-6b8a-49cc-9b81-5154eee498dc.jpg";
        eighthMovie.title = "Harry potter and the deathly hallows: part 2";
        advancedSeriesList.add(eighthMovie);
    }

    public void setAdvancedSeriesRv() {
        advancedSeriesRv = findViewById(R.id.advanced_series_rv);
        advancedSeriesRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        advancedSeriesAdapter = new AdvancedSeriesAdapter();
        advancedSeriesAdapter.setData(advancedSeriesList);
        advancedSeriesRv.setAdapter(advancedSeriesAdapter);
    }
}