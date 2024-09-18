package com.douglasbello;

import com.douglasbello.ecommerce.ECommercePlatform;
import com.douglasbello.factories.impl.EuropeFactory;
import com.douglasbello.factories.impl.SouthAmericaFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("European e-commerce:");
        ECommercePlatform europeanPlatform = new ECommercePlatform(new EuropeFactory());
        europeanPlatform.applyTheme();
        europeanPlatform.processPayment();

        System.out.println("\n---------------------------------------------------------\n");

        System.out.println("South American e-commerce:");
        ECommercePlatform southAmericanPlatform = new ECommercePlatform(new SouthAmericaFactory());
        southAmericanPlatform.applyTheme();
        southAmericanPlatform.processPayment();
    }
}