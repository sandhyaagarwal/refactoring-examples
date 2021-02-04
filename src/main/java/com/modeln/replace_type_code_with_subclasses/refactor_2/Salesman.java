package com.modeln.replace_type_code_with_subclasses.refactor_2;

public class Salesman extends Employee {
    private int _commission;

    int getType() {
        return Employee.SALESMAN;
    }

    int payAmount() {
        return getMonthlySalary() + _commission;
    }
}
