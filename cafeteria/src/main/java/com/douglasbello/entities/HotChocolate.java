package com.douglasbello.entities;

public class HotChocolate implements Drink {
    @Override
    public String getDescription() {
        return "Chocolate";
    }

    @Override
    public Double getPrice() {
        return 4.0;
    }
}