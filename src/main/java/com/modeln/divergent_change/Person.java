package com.modeln.divergent_change;

public class Person {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    public void setName(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ") " + _officeNumber);
    }

    public String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this._officeAreaCode = _officeAreaCode;
    }

    public String getOfficeNumber() {
        return _officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this._officeNumber = _officeNumber;
    }
}
