package org.tensorflow.lite.tomatovision.detection;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class solusi extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SolusiAdapter solusiAdapter;
    private ArrayList<SolusiModel> solusiModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solusi);

        getData();

        recyclerView = findViewById(R.id.recyleview);
        solusiAdapter = new SolusiAdapter(solusiModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(solusi.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(solusiAdapter);
    }

    private void getData() {
        solusiModel = new ArrayList<>();
        solusiModel.add(new SolusiModel("Bintik Bakteri", R.drawable.bintikbakteri));
        solusiModel.add(new SolusiModel("Bintik Daun Septoria", R.drawable.bintikdaunseptoria));
        solusiModel.add(new SolusiModel("Bintik Target Tomat", R.drawable.bintiktargettomat));
        solusiModel.add(new SolusiModel("Bintik Target Tomat", R.drawable.bintiktargettomat));
        solusiModel.add(new SolusiModel("Tomat Sehat", R.drawable.tomatsehat));
        solusiModel.add(new SolusiModel("Tomato Late Blight", R.drawable.lateblight));
        solusiModel.add(new SolusiModel("Tomato Leaf Mold", R.drawable.leafmold));
        solusiModel.add(new SolusiModel("Tungai Laba-laba Dua Bintik", R.drawable.labaduabintik));
        solusiModel.add(new SolusiModel(" Virus Kuning Keriting", R.drawable.kuningkeriting));
        solusiModel.add(new SolusiModel("Virus Mozaik Tomat", R.drawable.mozaiktomat));
    }
}