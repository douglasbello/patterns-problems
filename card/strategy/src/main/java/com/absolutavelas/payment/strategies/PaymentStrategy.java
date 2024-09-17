package com.absolutavelas.payment.strategies;

import com.absolutavelas.payment.strategies.enums.PaymentType;

public interface PaymentStrategy {
    void pay();
    PaymentType getPaymentType();
}