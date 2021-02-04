package com.modeln.long_parameter_lists.refactor_1;

public class Account {
    private int _quantity;
    private int _itemPrice;

    public double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double finalPrice = discountedPrice(basePrice);
        return finalPrice;
    }

    private int getDiscountLevel() {
        if(_quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }

    private double discountedPrice(int basePrice) {
        if(getDiscountLevel() == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }

    }
}
