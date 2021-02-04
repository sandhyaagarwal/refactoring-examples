package com.modeln.replace_type_code_with_subclasses.refactor_2;

public class Manager extends Employee {
    private int _bonus;

    int getType() {
        return Employee.MANAGER;
    }

    int payAmount() {
        return getMonthlySalary() + _bonus;
    }
}
