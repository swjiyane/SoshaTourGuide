package com.example.codetribe.soshatourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TourActivity extends AppCompatActivity {

    ImageView about, communication, churches, education, hangouts, shopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);

        //Find view that shows the categories
        about = (ImageView) findViewById(R.id.about);
        communication = (ImageView) findViewById(R.id.communication);
        education = (ImageView) findViewById(R.id.education);
        hangouts = (ImageView) findViewById(R.id.hangouts);
        shopping = (ImageView) findViewById(R.id.shopping);

        //onClickListeners
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(TourActivity.this, AboutActivity.class);
                Toast.makeText(view.getContext(), "About", Toast.LENGTH_SHORT).show();
                startActivity(aboutIntent);
            }
        });

        communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent languageIntent = new Intent(TourActivity.this, LanguageActivity.class);
                Toast.makeText(view.getContext(), "Language", Toast.LENGTH_SHORT).show();
                startActivity(languageIntent);
            }
        });


        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent educationIntent = new Intent(TourActivity.this, EducationActivity.class);
                Toast.makeText(view.getContext(), "Education", Toast.LENGTH_SHORT).show();
                startActivity(educationIntent);
            }
        });

        hangouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hangoutsIntent = new Intent(TourActivity.this, HangoutsActivity.class);
                Toast.makeText(view.getContext(), "Hangouts", Toast.LENGTH_SHORT).show();
                startActivity(hangoutsIntent);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(TourActivity.this, ShoppingActivity.class);
                Toast.makeText(view.getContext(), "Shopping", Toast.LENGTH_SHORT).show();
                startActivity(shoppingIntent);
            }
        });
    }
}
