package com.modeln.replace_type_code_with_state.refactor_2;

class Engineer extends EmployeeType {
    int getTypeCode() {
        return ENGINEER;
    }

    int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }
}
