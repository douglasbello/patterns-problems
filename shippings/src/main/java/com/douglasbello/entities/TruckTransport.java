package com.douglasbello.entities;

public class TruckTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck ground delivery.");
    }
}