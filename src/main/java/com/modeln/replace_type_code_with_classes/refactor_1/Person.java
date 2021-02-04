package com.modeln.replace_type_code_with_classes.refactor_1;

import com.modeln.replace_type_code_with_classes.BloodGroup;

public class Person {
    public static final int O = BloodGroup.O.getCode();
    public static final int A = BloodGroup.A.getCode();
    public static final int B = BloodGroup.B.getCode();
    public static final int AB = BloodGroup.AB.getCode();

    private BloodGroup _bloodGroup;

    public Person(int bloodGroup) {
        _bloodGroup = BloodGroup.code(bloodGroup);
    }

    public int getBloodGroup() {
        return _bloodGroup.getCode();
    }

    public void seBloodGroup(int arg) {
        _bloodGroup = BloodGroup.code(arg);
    }

}
