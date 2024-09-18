package com.douglasbello.complex_subsytem.impl;

import com.douglasbello.complex_subsytem.Device;

public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Turning TV on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning TV off...");
    }
}