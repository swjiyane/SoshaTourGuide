package com.example.codetribe.soshatourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getActionBar().setTitle("Education");
        getActionBar().setSubtitle("Learning is Life");

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word ("Ikhwezi Primary School","Block AA"," 087 234 9763"));
        words.add(new Word("Siyokhela Secondary School"," Block AA, Buitekant - Block AA","0728951364"));
        words.add(new Word("Memezelo High School","Block AA", "28462349385"));
        words.add(new Word("Lethabong High School","Block FF","012 791 3553"));
        words.add(new Word("Kgomotso High School","Block DD","063 670 6363"));
        words.add(new Word("Moepathutse Secondary School","Block F","012 799 5005"));
        words.add(new Word(" Botse-Botse High School","Block HH","012 799 5005"));
        words.add(new Word("Echibini Secondary School","Block JJ","012 799 5005"));
        words.add(new Word("Wallmansthal High School","Block K","012 791 1511"));
        words.add(new Word("Phuthanang Primary School","Block H","012 791 1047"));
        words.add(new Word("Babina-Phuti Secondary School","Block BB","012 790 3420"));
        words.add(new Word("Curro Academy Soshanguve","Block VV"," 087 285 4700"));
        words.add(new Word("Soshanguve High School","Block FF"," 012 798 3968"));
        words.add(new Word("Makhosini Combined School","Block G","012 713 0907"));

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
