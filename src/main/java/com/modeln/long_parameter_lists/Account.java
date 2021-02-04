package com.modeln.long_parameter_lists;

public class Account {
    private int _quantity;
    private int _itemPrice;

    public double getPrice() {
        int basePrice = _quantity * _itemPrice;
        int discountLevel;
        if(_quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }

        double finalPrice = discountedPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private double discountedPrice(int basePrice, int discountLevel) {
        if(discountLevel == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }

    }
}
