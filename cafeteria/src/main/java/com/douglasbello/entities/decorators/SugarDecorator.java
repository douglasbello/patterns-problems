package com.douglasbello.entities.decorators;

import com.douglasbello.entities.Drink;

public class SugarDecorator extends BaseDrinkDecorator {
    public SugarDecorator(Drink wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 0.10;
    }
}