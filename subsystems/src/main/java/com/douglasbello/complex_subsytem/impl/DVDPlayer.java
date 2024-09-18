package com.douglasbello.complex_subsytem.impl;

import com.douglasbello.complex_subsytem.Device;

public class DVDPlayer implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning DVD Player on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning DVD Player off...");
    }

    public void playMovie(String movieName) {
        System.out.println("Playing movie: '" + movieName + "'");
    }
}