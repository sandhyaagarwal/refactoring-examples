package com.modeln.long_method.refactor_1;

public class Gamma {
    private final Account _account;
    private int _inputVal;
    private int _quantity;
    private int _yearToDate;
    private int _importantValue1;
    private int _importantValue2;
    private int _importantValue3;

    Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
        _account = source;
        _inputVal = inputValArg;
        _quantity = quantityArg;
        _yearToDate = yearToDateArg;
    }

    public int compute() {
        _importantValue1 = (_inputVal * _quantity) + _account.delta();
        _importantValue2 = (_inputVal * _yearToDate) + 100;
        if ((_yearToDate - _importantValue1) > 100) {
            _importantValue2 -= 20;
        }
        _importantValue3 = _importantValue2 * 7;
        // and so on
        return _importantValue3 - 2 * _importantValue1;
    }
}
