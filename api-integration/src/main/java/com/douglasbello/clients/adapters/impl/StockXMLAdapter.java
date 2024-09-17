package com.douglasbello.clients.adapters.impl;

import com.douglasbello.clients.StockXMLApi;
import com.douglasbello.clients.adapters.Adapter;

public class StockXMLAdapter implements Adapter {
    private StockXMLApi api = new StockXMLApi();

    @Override
    public int getStock() {
        return api.getStock().getStock();
    }
}