package com.douglasbello.clients.adapters.impl;

import com.douglasbello.clients.adapters.Adapter;

public class StockStringAdapter implements Adapter {
    private String stock;

    public StockStringAdapter(String stock) {
        this.stock = stock;
    }

    @Override
    public int getStock() {
        return Integer.parseInt(stock);
    }
}