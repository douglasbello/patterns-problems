package com.absolutavelas.payment;

import com.absolutavelas.payment.strategies.PaymentStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * esse tipo de Factory seria bem mais útil em um projeto Spring, pois o Spring injetaria todos os strategies automaticamente por causa da injeção de dependência.
 */
public class PaymentStrategyFactory {
    private final Map<String, PaymentStrategy> strategies = new HashMap<>();

    public PaymentStrategyFactory(Set<PaymentStrategy> strategies) {
        strategies.forEach(st -> this.strategies.put(st.getPaymentType().getName(), st));
    }

    public PaymentStrategy getStrategy(String type) throws Exception {
        PaymentStrategy strategy = strategies.get(type.toUpperCase());

        if (strategy == null)
            throw new Exception("Tipo inválido.");

        return strategy;
    }
}