package com.modeln.duplicate;

public class ResidentialSite extends Site {
    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
