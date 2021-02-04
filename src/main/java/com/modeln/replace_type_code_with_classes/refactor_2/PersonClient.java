package com.modeln.replace_type_code_with_classes.refactor_2;

import com.modeln.replace_type_code_with_classes.BloodGroup;

public class PersonClient {
    public static void main(String[] args) {
        Person thePerson = new Person(BloodGroup.A);
        System.out.println("Blood Group = " + thePerson.getBloodGroupCode());
    }
}
