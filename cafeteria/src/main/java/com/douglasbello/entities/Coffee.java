package com.douglasbello.entities;

public class Coffee implements Drink {

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public Double getPrice() {
        return 2.0;
    }
}