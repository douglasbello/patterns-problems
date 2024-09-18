package com.douglasbello.entities;

public class AirplaneTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Airplane delivery.");
    }
}