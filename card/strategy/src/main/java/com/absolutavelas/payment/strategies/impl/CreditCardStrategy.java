package com.absolutavelas.payment.strategies.impl;

import com.absolutavelas.payment.strategies.PaymentStrategy;
import com.absolutavelas.payment.strategies.enums.PaymentType;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        if (hasLimit()) {
            System.out.println("Pagamento efetuado");
            return;
        }

        System.out.println("Sem limite no cartão.");
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.CREDIT_CARD;
    }

    private boolean hasLimit() {
        return true;
    }
}