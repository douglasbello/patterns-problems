package com.douglasbello.models;

public class Media {
    private String url;
    private boolean isFree;

    public Media(String url, boolean isFree) {
        this.url = url;
        this.isFree = isFree;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}