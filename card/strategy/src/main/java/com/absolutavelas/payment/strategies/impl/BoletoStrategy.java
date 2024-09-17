package com.absolutavelas.payment.strategies.impl;

import com.absolutavelas.payment.strategies.PaymentStrategy;
import com.absolutavelas.payment.strategies.enums.PaymentType;

public class BoletoStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        generateBoleto();

        System.out.println("Pagamento efetuado.");
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.BOLETO;
    }

    private void generateBoleto() {
        try {
            System.out.println("Gerando boleto...");
            Thread.sleep(2000);

            System.out.println("Boleto gerado.");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}