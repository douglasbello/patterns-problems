package com.douglasbello.entities.decorators;

import com.douglasbello.entities.Drink;

public abstract class BaseDrinkDecorator implements Drink {
    private Drink wrappee;

    public BaseDrinkDecorator(Drink wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription();
    }

    @Override
    public Double getPrice() {
        return wrappee.getPrice();
    }
}