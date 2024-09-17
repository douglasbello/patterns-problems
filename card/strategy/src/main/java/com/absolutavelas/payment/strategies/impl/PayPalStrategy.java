package com.absolutavelas.payment.strategies.impl;

import com.absolutavelas.payment.strategies.PaymentStrategy;
import com.absolutavelas.payment.strategies.enums.PaymentType;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        String username = oAuthLoginPayPal();

        try {
            System.out.println("Realizando pagamento com a conta: " + username);
            Thread.sleep(1000);

            System.out.println("Pagamento realizado.");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.PAYPAL;
    }

    private String oAuthLoginPayPal() {
        return "douglasbello";
    }
}