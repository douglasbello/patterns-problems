package com.douglasbello.factories.impl;

import com.douglasbello.factories.RegionFactory;
import com.douglasbello.payment.Payment;
import com.douglasbello.payment.impl.EuropePayment;
import com.douglasbello.theme.Theme;
import com.douglasbello.theme.impl.EuropeTheme;

public class EuropeFactory implements RegionFactory {
    @Override
    public Theme createTheme() {
        return new EuropeTheme();
    }

    @Override
    public Payment createPayment() {
        return new EuropePayment();
    }
}