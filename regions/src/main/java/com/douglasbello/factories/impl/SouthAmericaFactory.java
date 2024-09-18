package com.douglasbello.factories.impl;

import com.douglasbello.factories.RegionFactory;
import com.douglasbello.payment.Payment;
import com.douglasbello.payment.impl.SouthAmericaPayment;
import com.douglasbello.theme.Theme;
import com.douglasbello.theme.impl.SouthAmericaTheme;

public class SouthAmericaFactory implements RegionFactory {
    @Override
    public Theme createTheme() {
        return new SouthAmericaTheme();
    }

    @Override
    public Payment createPayment() {
        return new SouthAmericaPayment();
    }
}