package com.douglasbello.factories;

import com.douglasbello.payment.Payment;
import com.douglasbello.theme.Theme;

public interface RegionFactory {
    Theme createTheme();
    Payment createPayment();
}