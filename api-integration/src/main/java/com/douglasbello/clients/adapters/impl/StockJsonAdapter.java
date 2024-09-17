package com.douglasbello.clients.adapters.impl;

import com.douglasbello.clients.StockJsonApi;
import com.douglasbello.clients.adapters.Adapter;

public class StockJsonAdapter implements Adapter {
    private StockJsonApi api = new StockJsonApi();

    @Override
    public int getStock() {
        return api.getStock().getStock();
    }
}