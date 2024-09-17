package com.douglasbello;

import com.douglasbello.entities.Coffee;
import com.douglasbello.entities.Drink;
import com.douglasbello.entities.HotChocolate;
import com.douglasbello.entities.decorators.ChantillyDecorator;
import com.douglasbello.entities.decorators.MilkDecorator;
import com.douglasbello.entities.decorators.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        Drink coffeeMilkAndSugar = new MilkDecorator(
                new SugarDecorator(
                        new Coffee()
                )
        );

        System.out.println("----------------Coffee----------------");
        System.out.println(coffeeMilkAndSugar.getDescription());
        System.out.println(coffeeMilkAndSugar.getPrice());

        Drink hotChocolateAndChantilly = new ChantillyDecorator(new HotChocolate());

        System.out.println("----------------Hot Chocolate----------------");
        System.out.println(hotChocolateAndChantilly.getDescription());
        System.out.println(hotChocolateAndChantilly.getPrice());
    }
}