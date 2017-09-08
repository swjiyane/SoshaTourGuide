package com.example.codetribe.soshatourguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CodeTribe on 8/17/2017.
 */

public class LanguageAdapter extends ArrayAdapter<Word> {


    public LanguageAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_language, parent, false);
        }

        Word currentWord = getItem(position);

        TextView sepitori_text_view= (TextView) listItemView.findViewById(R.id.sepitori_text_view);
        sepitori_text_view.setText(currentWord.getmSepitoriTranslation());

        TextView default_text_view= (TextView) listItemView.findViewById(R.id.default_text_view);
        default_text_view.setText(currentWord.getmDefaultTranslation());

        return listItemView;
    }

}

