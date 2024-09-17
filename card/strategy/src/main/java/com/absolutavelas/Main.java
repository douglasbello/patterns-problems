package com.absolutavelas;

import com.absolutavelas.payment.PaymentStrategyFactory;
import com.absolutavelas.payment.strategies.PaymentStrategy;
import com.absolutavelas.payment.strategies.impl.BoletoStrategy;
import com.absolutavelas.payment.strategies.impl.CreditCardStrategy;
import com.absolutavelas.payment.strategies.impl.PayPalStrategy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seu pedido deu R$ 149,90.");
        System.out.println("Escolha o tipo de pagamento: Credit Card, PayPal ou Boleto");

        String type = sc.next();

        // inicializando Factory
        Set<PaymentStrategy> strategies = new HashSet<>();
        strategies.add(new BoletoStrategy());
        strategies.add(new PayPalStrategy());
        strategies.add(new CreditCardStrategy());
        PaymentStrategyFactory factory = new PaymentStrategyFactory(strategies);

        PaymentStrategy strategy = factory.getStrategy(type);
        strategy.pay();
    }
}