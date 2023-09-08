package com.buachaillmaith.blakesorganicandroid.ui;

import com.google.android.gms.maps.model.LatLng;

public class Item {
    private int cover;
    private String longDescription;
    private String title;
    private LatLng latLng;
    private String description;
    private String id;

    public Item(int cover, String longDescription, String title, String description, String id, LatLng latLng) {
        this.cover = cover;
        this.longDescription = longDescription;
        this.title = title;
        this.description = description;
        this.id = id;
        this.latLng = latLng;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}