package com.modeln.replace_type_code_with_subclasses.refactor_1;

class Engineer extends Employee {
    int getType() {
        return Employee.ENGINEER;
    }
}
