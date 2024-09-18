package com.douglasbello.payment.impl;

import com.douglasbello.payment.Payment;

public class EuropePayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("European payment initialized.");
    }
}