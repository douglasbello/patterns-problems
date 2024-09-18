package com.douglasbello.entities.factory;

import com.douglasbello.entities.Transport;

public abstract class TransportFactory {
    public void deliver() {
        Transport transport = createTransport();
        transport.deliver();;
    }

    public abstract Transport createTransport();
}