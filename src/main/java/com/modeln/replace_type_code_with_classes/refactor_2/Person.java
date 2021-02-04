package com.modeln.replace_type_code_with_classes.refactor_2;

import com.modeln.replace_type_code_with_classes.BloodGroup;

public class Person {
    private BloodGroup _bloodGroup;

    public Person(BloodGroup bloodGroup) {
        _bloodGroup = bloodGroup;
    }

    public void seBloodGroup(BloodGroup arg) {
        _bloodGroup = arg;
    }

    public int getBloodGroupCode() {
        return _bloodGroup.getCode();
    }
}
