package com.karishan_897.smd2_musify;

import android.media.MediaPlayer;

public class MusicMediaPlayer {
    static MediaPlayer instance;
    public static MediaPlayer getInstance(){
        if(instance == null){
            instance = new MediaPlayer();
        }
        return instance;
    }

    public static int currentIndex = -1;

}
