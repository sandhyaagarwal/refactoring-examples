package com.modeln.long_method.refactor_1;

public class Account {
    private int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    public int delta() {
        return 0;
    }
}
