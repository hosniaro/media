package com.example.myappmusic;

public class Song {
   private String name;
   private int song;

    public Song(String name, int song) {
        this.name = name;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public int getSong() {
        return song;
    }
}
