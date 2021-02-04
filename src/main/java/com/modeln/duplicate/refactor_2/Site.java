package com.modeln.duplicate.refactor_2;

public abstract class Site {
    protected int _units;
    protected int _rate;
    public static final int TAX_RATE = 10;


    private double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount(double base);

}
