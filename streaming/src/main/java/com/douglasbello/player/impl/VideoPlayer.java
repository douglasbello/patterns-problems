package com.douglasbello.player.impl;

import com.douglasbello.models.Media;
import com.douglasbello.player.Player;

public class VideoPlayer implements Player {
    @Override
    public void play(Media media) {
        System.out.println("Playing video: " + media.getUrl());
    }
}