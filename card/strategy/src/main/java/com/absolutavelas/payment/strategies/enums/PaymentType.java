package com.absolutavelas.payment.strategies.enums;

public enum PaymentType {
    CREDIT_CARD("CREDITCARD"),
    PAYPAL("PAYPAL"),
    BOLETO("BOLETO");

    private String name;

    PaymentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}