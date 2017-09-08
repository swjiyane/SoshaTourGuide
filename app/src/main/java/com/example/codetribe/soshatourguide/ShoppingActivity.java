package com.example.codetribe.soshatourguide;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getActionBar().setTitle("Shopping");
        getActionBar().setSubtitle("Where to shop around Sosha");

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word ("Soshanguve Crossing Mall","Ruth First Rd & Aubrey Matlala Street"," 087 234 9763",R.drawable.soshanguvecrossing,"Hours:09H00 - 20H00"));
        words.add(new Word("Soshanguve Plaza"," 22 Commissioner St, Buitekant - Block AA","0728951364",R.drawable.soshanguveplaza,"Hours:09H00-17H00"));
        words.add(new Word("Batho Plaza"," Corner Dr Maroko Drive and Deadly Nightshade Street - Block SS","012 662 3411",R.drawable.bathoplaza,"Hours:08H00-17H00"));
        words.add(new Word("ThornTree Shopping Complex","Hebron Rd, Soshanguve - VV","012 791 3553",R.drawable.thorntree,"Hours: 08H00-18H00"));
        words.add(new Word(" Nafcoc Shopping Centre","Commissioner St & Buitenkant St, Block F","012 799 5005",R.drawable.thorntree,"Hours:09H00-17H00"));

        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_item);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                word.getmContactNumber();
                Intent intent = new Intent(Intent.ACTION_DIAL);

            }

        });

    }
}

