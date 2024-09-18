package com.douglasbello.entities.factory.impl;

import com.douglasbello.entities.BikeTransport;
import com.douglasbello.entities.Transport;
import com.douglasbello.entities.factory.TransportFactory;

public class BikeTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new BikeTransport();
    }
}