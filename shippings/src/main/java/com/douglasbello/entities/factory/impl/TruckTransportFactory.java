package com.douglasbello.entities.factory.impl;

import com.douglasbello.entities.Transport;
import com.douglasbello.entities.TruckTransport;
import com.douglasbello.entities.factory.TransportFactory;

public class TruckTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new TruckTransport();
    }
}