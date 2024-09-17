package com.douglasbello.models;

public class Video extends Media {
    private String platformName;

    public Video(String url, boolean isFree, String platformName) {
        super(url, isFree);
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}