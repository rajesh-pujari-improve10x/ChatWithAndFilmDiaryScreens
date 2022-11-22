package com.example.chatwithandfilmdiaryscreens.gods;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chatwithandfilmdiaryscreens.R;

import java.util.ArrayList;

public class GodsActivity extends AppCompatActivity {

    public ArrayList<God> gods;
    public RecyclerView godsRv;
    public GodsAdapter godsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gods);
        getSupportActionBar().setTitle("Gods");
        setupGodsList();
        setupGodsRv();
    }

    public void setupGodsList() {
        gods = new ArrayList<>();
        God firstGod = new God();
        firstGod.title = "Sri durga sahasranamavali";
        firstGod.imageUrl = "https://i.pinimg.com/736x/2e/18/d3/2e18d33d1967a648ff8bc353d9b10702.jpg";
        gods.add(firstGod);

        God secondGod = new God();
        secondGod.title = "Sri Lalitha Sahasranamavali";
        secondGod.imageUrl = "https://i.pinimg.com/736x/2e/18/d3/2e18d33d1967a648ff8bc353d9b10702.jpg";
        gods.add(secondGod);

        God thirdGod = new God();
        thirdGod.title = "Sri Durga Astotharam";
        thirdGod.imageUrl = "https://i.pinimg.com/736x/2e/18/d3/2e18d33d1967a648ff8bc353d9b10702.jpg";
        gods.add(thirdGod);

        God fourthtGod = new God();
        fourthtGod.title = "Sri Durga Sahasranama sthotram";
        fourthtGod.imageUrl = "https://i.pinimg.com/736x/2e/18/d3/2e18d33d1967a648ff8bc353d9b10702.jpg";
        gods.add(fourthtGod);

        God fifthGod = new God();
        fifthGod.title = "Durga Kavacham";
        fifthGod.imageUrl = "https://i.pinimg.com/736x/2e/18/d3/2e18d33d1967a648ff8bc353d9b10702.jpg";
        gods.add(fifthGod);

        God sixthGod = new God();
        sixthGod.title = "Gayatri Kavacham";
        sixthGod.imageUrl = "https://i.pinimg.com/736x/2e/18/d3/2e18d33d1967a648ff8bc353d9b10702.jpg";
        gods.add(sixthGod);
    }

    public void setupGodsRv() {
        godsRv = findViewById(R.id.gods_rv);
        godsRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        godsAdapter = new GodsAdapter();
        godsAdapter.setData(gods);
        godsRv.setAdapter(godsAdapter);
    }
}