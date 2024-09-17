package com.douglasbello.entities.decorators;

import com.douglasbello.entities.Drink;

public class MilkDecorator extends BaseDrinkDecorator {
    public MilkDecorator(Drink wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 0.25;
    }
}