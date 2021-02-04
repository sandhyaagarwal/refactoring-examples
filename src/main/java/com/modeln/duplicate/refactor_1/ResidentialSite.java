package com.modeln.duplicate.refactor_1;

public class ResidentialSite extends Site {
    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    private double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    private double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }
}

