package com.douglasbello.entities;

public class User implements EpisodeListener {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void newEpisodeAlert(Show show) {
        System.out.println("Hello " + this.name + ", a new " + show.getName() + " episode has just been released.");
    }
}