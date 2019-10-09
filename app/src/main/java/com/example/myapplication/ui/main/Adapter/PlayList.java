package com.example.myapplication.ui.main.Adapter;

public class PlayList {
    private String SongName;
    private String SingerName;
    public PlayList(){
    };

    public PlayList(String songName, String singerName) {
        SongName = songName;
        SingerName = singerName;
    }

    //getter

    public String getSongName() {
        return SongName;
    }

    public String getSingerName() {
        return SingerName;
    }

    //setter

    public void setSongName(String songName) {
        SongName = songName;
    }

    public void setSingerName(String singerName) {
        SingerName = singerName;
    }
}
