package com.modeln.duplicate.refactor_2;

public class ResidentialSite extends Site {

    protected double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }
}
