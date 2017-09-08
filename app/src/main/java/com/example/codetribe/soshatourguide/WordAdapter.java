package com.example.codetribe.soshatourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CodeTribe on 8/1/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super (context, 0, words);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentWord.getmName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentWord.getmAddress());

        TextView contactnumberTextView = (TextView) listItemView.findViewById(R.id.contact_number);
        contactnumberTextView.setText(currentWord.getmContactNumber());

        ImageView imageImageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage())
        {
            imageImageView.setImageResource(currentWord.getmImageResourceId());
            imageImageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageImageView.setVisibility(View.GONE);
        }

        TextView moreTextView = (TextView) listItemView.findViewById(R.id.more);
        moreTextView.setText(currentWord.getmMore());

        return listItemView;
    }

}
