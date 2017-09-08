package com.example.codetribe.soshatourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HangoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getActionBar().setTitle("Hangouts");
        getActionBar().setSubtitle("Eat and Chill");

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word ("VanTuka"," Cnr Transfer - Block K","079 902 3329",R.drawable.vantuka,"Hours:14h00 - 02H00"));
        words.add(new Word("ShortLeft"," University Road - Block K","0728951364",R.drawable.shortleft,"Hours:09H00-02h00"));
        words.add(new Word("LiquidZone","1340 Block DD"," 076 675 7017",R.drawable.liquidzone,"Hours:11H00-02H00"));
        words.add(new Word("De H2O Lounge","2105 Block H","078 197 9786",R.drawable.h2o,"17H00-02H00"));
        words.add(new Word("Nkukhu Box","Block L","012 755 0304",R.drawable.nkukhubox,"09H00-23H00"));
        words.add(new Word("The Mushroom Hut","1193/4 Block FF","072 906 9391",R.drawable.mushroomhut,"09H00-22H00"));
        words.add(new Word("Old Mans Cafe","1192 Block AA","072 333 0663",R.drawable.oldmanscafe,"09H00-22H00"));

        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_item);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
            }

        });
    }
}
