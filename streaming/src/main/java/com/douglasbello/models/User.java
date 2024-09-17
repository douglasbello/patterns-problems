package com.douglasbello.models;

public class User {
    private String username;
    private boolean isPremium;

    public User(String username, boolean isPremium) {
        this.username = username;
        this.isPremium = isPremium;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}