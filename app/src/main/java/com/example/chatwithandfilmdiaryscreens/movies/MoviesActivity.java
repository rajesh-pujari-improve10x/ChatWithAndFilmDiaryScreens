package com.example.chatwithandfilmdiaryscreens.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chatwithandfilmdiaryscreens.R;

import java.util.ArrayList;

public class MoviesActivity extends AppCompatActivity {

    public ArrayList<Movies> movieses;
    public RecyclerView moviesesRv;
    public MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        getSupportActionBar().setTitle("Movies");
        setupMovieses();
        setupMoviesRv();
        }

    public void setupMovieses() {
        movieses = new ArrayList<>();
        Movies firstMovie = new Movies();
        firstMovie.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220";
        firstMovie.title = "Harry potter and the sorcerer's stone";
        movieses.add(firstMovie);

        Movies secondMovie = new Movies();
        secondMovie.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        secondMovie.title = "Harry potter and chamber of secrets";
        movieses.add(secondMovie);

        Movies thirdMovie = new Movies();
        thirdMovie.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
        thirdMovie.title = "Harry potter and the prisoner of azkaban";
        movieses.add(thirdMovie);

        Movies fourthMovie = new Movies();
        fourthMovie.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        fourthMovie.title = "Harry potter and the goblet of fire";
        movieses.add(fourthMovie);

        Movies fifthMovie = new Movies();
        fifthMovie.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        fifthMovie.title = "Harry potter and the sorcerer's stone";
        movieses.add(fifthMovie);

        Movies sixthMovie = new Movies();
        sixthMovie.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg";
        sixthMovie.title = "Harry potter and the sorcerer's stone";
        movieses.add(sixthMovie);

        Movies seventhMovie = new Movies();
        seventhMovie.imageUrl = "https://images.moviesanywhere.com/de6092b467fc299fdf79a51dfa7f9710/12b877a3-28de-46ff-820f-dd8bf07e8edb.jpg";
        seventhMovie.title = "Harry potter and the deathly hallows: part 1";
        movieses.add(seventhMovie);

        Movies eighthMovie = new Movies();
        eighthMovie.imageUrl = "https://images.moviesanywhere.com/5f0537520f90b687fc5db7f241affc4c/0280fd81-6b8a-49cc-9b81-5154eee498dc.jpg";
        eighthMovie.title = "Harry potter and the deathly hallows: part 2";
        movieses.add(eighthMovie);
    }

    public void setupMoviesRv() {
        moviesesRv = findViewById(R.id.movies_rv);
        moviesesRv.setLayoutManager(new GridLayoutManager(this, 2));
        moviesAdapter = new MoviesAdapter();
        moviesAdapter.setData(movieses);
        moviesesRv.setAdapter(moviesAdapter);
    }
}
