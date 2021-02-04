package com.modeln.replace_type_code_with_subclasses.refactor_2;

class Engineer extends Employee {
    int getType() {
        return Employee.ENGINEER;
    }

    int payAmount() {
        return getMonthlySalary();
    }
}
