package com.modeln.replace_type_code_with_subclasses.refactor_1;

public class Manager extends Employee {
    int getType() {
        return Employee.MANAGER;
    }
}
