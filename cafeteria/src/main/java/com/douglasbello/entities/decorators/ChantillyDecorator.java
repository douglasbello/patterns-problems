package com.douglasbello.entities.decorators;

import com.douglasbello.entities.Drink;

public class ChantillyDecorator extends BaseDrinkDecorator {
    public ChantillyDecorator(Drink wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chantilly";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 1.0;
    }
}