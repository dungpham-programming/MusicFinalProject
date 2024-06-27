package com.ltmobile.music.model;

import com.ltmobile.music.model.abs.BaseApiModel;

public class Album extends BaseApiModel {
    private String artist;
    private long categoryId;

    public Album() {}

    public Album(String id, long categoryId, String name, String artist) {
        super(id, name);
        this.artist = artist;
        this.categoryId = categoryId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
}
