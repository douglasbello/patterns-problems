package com.douglasbello.entities.factory.impl;

import com.douglasbello.entities.AirplaneTransport;
import com.douglasbello.entities.Transport;
import com.douglasbello.entities.factory.TransportFactory;

public class AirplaneTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new AirplaneTransport();
    }
}