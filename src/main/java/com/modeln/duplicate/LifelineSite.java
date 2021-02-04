package com.modeln.duplicate;

public class LifelineSite extends Site {
    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
