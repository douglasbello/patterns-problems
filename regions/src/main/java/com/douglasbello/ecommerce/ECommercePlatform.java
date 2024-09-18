package com.douglasbello.ecommerce;

import com.douglasbello.factories.RegionFactory;
import com.douglasbello.payment.Payment;
import com.douglasbello.theme.Theme;

public class ECommercePlatform {
    private Theme theme;
    private Payment payment;

    public ECommercePlatform(RegionFactory factory) {
        this.theme = factory.createTheme();
        this.payment = factory.createPayment();
    }

    public void applyTheme() {
        theme.applyTheme();
    }

    public void processPayment() {
        payment.processPayment();
    }
}