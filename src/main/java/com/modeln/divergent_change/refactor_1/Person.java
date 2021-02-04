package com.modeln.divergent_change.refactor_1;

public class Person {
    private TelephoneNumber _officeTelephone = new TelephoneNumber();
    private String _name;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }

    TelephoneNumber getOfficeTelephone() {
        return _officeTelephone;
    }
}
