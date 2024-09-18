package com.douglasbello.entities;

public class BikeTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Bike express delivery.");
    }
}