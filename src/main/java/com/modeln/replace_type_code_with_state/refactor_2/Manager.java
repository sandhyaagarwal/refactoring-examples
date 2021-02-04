package com.modeln.replace_type_code_with_state.refactor_2;

public class Manager extends EmployeeType {
    int getTypeCode() {
        return MANAGER;
    }

    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
