package com.example.codetribe.soshatourguide;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 Button tour_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       tour_btn = (Button) findViewById(R.id.tour_btn);

        tour_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tourIntent = new Intent(MainActivity.this, TourActivity.class);
                Toast.makeText(view.getContext(), "Tour Guide", Toast.LENGTH_SHORT).show();
                getSupportActionBar().setTitle("Tour Guide");
                startActivity(tourIntent);
            }
        });
    }
}