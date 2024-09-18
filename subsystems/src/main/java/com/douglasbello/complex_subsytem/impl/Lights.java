package com.douglasbello.complex_subsytem.impl;

import com.douglasbello.complex_subsytem.Device;

public class Lights implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning lights on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning lights off...");
    }
}