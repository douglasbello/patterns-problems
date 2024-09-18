package com.douglasbello.payment.impl;

import com.douglasbello.payment.Payment;

public class SouthAmericaPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("South american payment type initialized.");
    }
}