package com.douglasbello.facade;

import com.douglasbello.complex_subsytem.impl.DVDPlayer;
import com.douglasbello.complex_subsytem.impl.Lights;
import com.douglasbello.complex_subsytem.impl.TV;

public class PlayMovieFacade {
    public void playMovie(String movieName) {
        Lights lights = new Lights();
        lights.turnOff();

        TV tv = new TV();
        tv.turnOn();

        DVDPlayer player = new DVDPlayer();
        player.turnOn();
        player.playMovie(movieName);
    }
}