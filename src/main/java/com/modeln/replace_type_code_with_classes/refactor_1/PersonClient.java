package com.modeln.replace_type_code_with_classes.refactor_1;

public class PersonClient {
    public static void main(String[] args) {
        Person thePerson = new Person(Person.A);
        System.out.println("Blood Group = " + thePerson.getBloodGroup());
    }
}
