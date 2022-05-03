package com.example.mplayer;

public class Song {
    private Long id;
    private String title;
    private String artist;

    public Song(Long id, String title,String artist){

        this.id=id;
        this.title=title;
        this.artist=artist;

    }


    public Long getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
