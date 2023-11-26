package org.tensorflow.lite.tomatovision.detection;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.profile:
                    // Pindah ke aktivitas profil
                    startActivity(new Intent(this, profile.class));
                    return true;
                case R.id.scan:
                    // Pindah ke aktivitas scan
                    startActivity(new Intent(this, DetectorActivity.class));
                    return true;
                case R.id.solusi:
                    // Pindah ke aktivitas solusi
                    startActivity(new Intent(this, solusi.class));
                    return true;
                // Tambahkan case lain sesuai dengan kebutuhan Anda
                default:
                    return false;
            }
        });
    }
}