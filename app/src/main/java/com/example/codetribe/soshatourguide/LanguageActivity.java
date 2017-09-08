package com.example.codetribe.soshatourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageActivity extends AppCompatActivity {


    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {

                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                            focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                        //pause playback
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);
                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                        //resume playback
                        mMediaPlayer.start();
                    } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                        releaseMediaPlayer();
                        //stop playback
                    }

                }
            };

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Things are fine!", "Dilo tsa ka di nametse RunX", R.raw.dilo_tsaka_dinametse));
        words.add(new Word("How are things?", "Dintshang?/veder?", R.raw.dintshang));
        words.add(new Word("He is critical but stable.", "O setse ka 1 bar, battrey e flat flat..", R.raw.osetse_ka_bar));
        words.add(new Word("You are out of line now!", "Wa off-rampa nou!", R.raw.wa_offramper));
        words.add(new Word("He is such a crook.", "Daai man ke Zuma!", R.raw.daai_man_ke_zuma));
        words.add(new Word("I ate at wimpy", "eish... Ne ke ipethantsha ko wimpy!", R.raw.eish_neke));
        words.add(new Word("Maybe he left...", "Am sure o vaile...", R.raw.am_sure_ovaile));
        words.add(new Word("Its Steve,am not sure about his surname...", "Bari ke Steve mang mang...", R.raw.bare_ke_sure));
        words.add(new Word("This girl is stupid!", "Ngwana o ke Racheal Kunutu", R.raw.ngwano_ke_racheal));
        words.add(new Word("Is he your boyfriend?", "Ke bhari ya gao?", R.raw.ke_bhari_yagao));
        words.add(new Word("He was going up and down", "Na le busy ka di vinki vonko", R.raw.nale_busy_kadi_vinki_vonko));
        words.add(new Word("Just for that reason!", "Net for dae ding!", R.raw.net_for_dai_deng));
        words.add(new Word("I dealt with them!", "Aaah, mxm katswa ka ena.", R.raw.ahhh_mxm));
        words.add(new Word("He has smelly armpits.", "Eish, oshapa ka di hotwings.", R.raw.hotwings));

       LanguageAdapter adapter =
                new LanguageAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_item);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                Word word = words.get(position);

                                                releaseMediaPlayer();

                                                mMediaPlayer = MediaPlayer.create(LanguageActivity

                                                        .this, word.getmAudioResourceId());
                                                //start audio file
                                                mMediaPlayer.start();

                                                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                                            }

                                        }
        );
    }

    @Override
    protected void onStop () {
        super.onStop();
        releaseMediaPlayer();
    }
    //clean up the media player
    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}
