package com.douglasbello;

import com.douglasbello.entities.enums.TransportType;
import com.douglasbello.entities.factory.TransportFactory;
import com.douglasbello.entities.factory.impl.AirplaneTransportFactory;
import com.douglasbello.entities.factory.impl.BikeTransportFactory;
import com.douglasbello.entities.factory.impl.TruckTransportFactory;

public class Main {
    public static void main(String[] args) {
        deliver(TransportType.GROUND_DELIVERY);
    }

    static void deliver(TransportType type) {
        if (type.equals(TransportType.AIR_DELIVERY)) {
            TransportFactory factory = new AirplaneTransportFactory();
            factory.deliver();
        } else if (type.equals(TransportType.GROUND_DELIVERY)) {
            TransportFactory factory = new TruckTransportFactory();
            factory.deliver();
        } else {
            TransportFactory factory = new BikeTransportFactory();
            factory.deliver();
        }
    }
}