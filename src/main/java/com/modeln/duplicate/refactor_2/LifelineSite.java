package com.modeln.duplicate.refactor_2;

public class LifelineSite extends Site {

    protected double getBaseAmount() {
        return _units * _rate;
    }

    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }
}
