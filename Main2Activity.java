package com.example.myappmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


public class Main2Activity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    ListView listView;

    ImageButton imageButton;

    /** Handles audio focus when playing a sound file */
    //private AudioManager mAudioManager;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

         final ArrayList<Song> arrayList = new ArrayList<>();

        arrayList.add(new Song("astro", R.raw.astro));
        arrayList.add(new Song("coffee", R.raw.coffee));
        arrayList.add(new Song("constellation", R.raw.constellation));
        arrayList.add(new Song("holiday", R.raw.holiday));
        arrayList.add(new Song("friday", R.raw.friday));
        arrayList.add(new Song("meadow", R.raw.meadow));
        arrayList.add(new Song("orange", R.raw.orange));
        arrayList.add(new Song("city", R.raw.city));
        arrayList.add(new Song("ice", R.raw.ice));
        arrayList.add(new Song("pick", R.raw.pick));
        arrayList.add(new Song("overr", R.raw.overr));
        arrayList.add(new Song("over", R.raw.over));
        arrayList.add(new Song("midnigh", R.raw.midnigh));
        arrayList.add(new Song("morning", R.raw.morning));

        ArrayAdapter<Song> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView = findViewById(R.id.song_list);
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file


                // Get the {@link Word} object at the given position the user clicked on
                Song song = arrayList.get(position);

                // Request audio focus so in order to play the audio file. The app needs to play a
                // short audio file, so we will request audio focus with a short amount of time
                // with AUDIOFOCUS_GAIN_TRANSIENT.
                mMediaPlayer = MediaPlayer.create(Main2Activity.this, song.getSong());
                 // Start the audio file
                if (listView.isClickable()) {
                    Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                    mMediaPlayer.start();
                    startActivity(intent);
                }


            }

        });


    }
    }
