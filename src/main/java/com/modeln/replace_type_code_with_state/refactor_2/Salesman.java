package com.modeln.replace_type_code_with_state.refactor_2;

public class Salesman extends EmployeeType {
    int getTypeCode() {
        return SALESMAN;
    }

    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
