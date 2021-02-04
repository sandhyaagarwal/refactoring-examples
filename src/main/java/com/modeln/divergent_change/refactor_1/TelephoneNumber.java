package com.modeln.divergent_change.refactor_1;

class TelephoneNumber {
    private String _areaCode;
    private String _number;

    public String getTelephoneNumber() {
        return ("(" + _areaCode + ") " + _number);
    }

    String getAreaCode() {
        return _areaCode;
    }

    void setAreaCode(String officeAreaCode) {
        this._areaCode = _areaCode;
    }

    String getNumber() {
        return _number;
    }

    void setNumber(String number) {
        this._number = _number;
    }
}
