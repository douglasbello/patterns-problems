package com.douglasbello.entities;

import java.util.HashSet;
import java.util.Set;

// this is the observable
public class Show {
    private String name;
    private Integer episodes;
    private Set<EpisodeListener> listeners = new HashSet<>();

    public Show() {
    }

    public Show(String name, Integer episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    public void addListener(EpisodeListener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(EpisodeListener listener) {
        this.listeners.remove(listener);
    }

    public void addEpisode() {
        this.episodes++;
        for (EpisodeListener listener : listeners) {
            listener.newEpisodeAlert(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }
}