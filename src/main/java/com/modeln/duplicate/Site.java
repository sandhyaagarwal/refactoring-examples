package com.modeln.duplicate;

public abstract class Site {
    protected int _units;
    protected int _rate;
    public static final int TAX_RATE = 10;
    protected abstract double getBillableAmount();
}
