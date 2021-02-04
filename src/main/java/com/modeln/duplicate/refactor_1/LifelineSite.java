package com.modeln.duplicate.refactor_1;

public class LifelineSite extends Site {
    protected double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    private double getBaseAmount() {
        return _units * _rate;
    }

    private double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }
}
