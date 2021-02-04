package com.modeln.long_parameter_lists.refactor_3;

public class Account {
    private int _quantity;
    private int _itemPrice;

    public double getPrice() {
        if(getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    private int getDiscountLevel() {
        if(_quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }

    private int getBasePrice() {
        return _quantity * _itemPrice;
    }
}
