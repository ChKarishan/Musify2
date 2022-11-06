package com.karishan_897.smd2_musify;


public class Playlists {
    String playlistName;
    String imageURL;

    public Playlists(String playlistName, String imageURL) {
        this.playlistName = playlistName;
        this.imageURL = imageURL;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}
