package com.example.myappmusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;



public class SongAdapter extends ArrayAdapter<Song> {
    private int mSongResourceID;

    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);


    }
    public SongAdapter(@NonNull Context context, ArrayList<Song> songs,int mSongResourceID) {
        super(context, 0, songs);

        this.mSongResourceID = mSongResourceID;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }
        return listItemView;
    }

    public int getmSongResourceID() {
        return mSongResourceID;
    }
}



