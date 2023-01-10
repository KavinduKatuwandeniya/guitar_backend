package com.app.guitar.Entity;

public class Song {

    public Song(){}

    public Song(int SongID, int ArtistID, String song, String intro, String inter, String lyrics, String music) {
        this.SongID=SongID;
        this.ArtistID = ArtistID;
        this.song = song;
        this.intro = intro;
        this.inter = inter;
        this.lyrics = lyrics;
        this.music = music;
    }

    private int SongID;
    private int ArtistID;
    private String song;
    private String intro;
    private String inter;
    private String lyrics;
    private String music;

    public int getSongID() {
        return SongID;
    }

    public void setSongID(int songID) {
        SongID = songID;
    }

    public int getArtistID() {
        return ArtistID;
    }

    public void setArtistID(int artistID) {
        ArtistID = artistID;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getInter() {
        return inter;
    }

    public void setInter(String inter) {
        this.inter = inter;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}
