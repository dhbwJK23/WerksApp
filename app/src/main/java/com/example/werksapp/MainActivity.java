package com.example.werksapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.werksapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize CardViews
        CardView newsCard = findViewById(R.id.newsCard);
        CardView kantineCard = findViewById(R.id.kantineCard);
        CardView jobboerseCard = findViewById(R.id.jobboerseCard);
        CardView parkplatzCard = findViewById(R.id.parkplatzCard);
        CardView reisevorgaengeCard = findViewById(R.id.reisevorgaengeCard);

        // Set click listeners for each CardView
        newsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(intent);
            }
        });

        kantineCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KantineActivity.class);
                startActivity(intent);
            }
        });

        jobboerseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JobboerseActivity.class);
                startActivity(intent);
            }
        });

        parkplatzCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ParkplatzActivity.class);
                startActivity(intent);
            }
        });

        reisevorgaengeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReisevorgaengeActivity.class);
                startActivity(intent);
            }
        });
    }
}
