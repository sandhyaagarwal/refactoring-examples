package com.modeln.replace_type_code_with_state.refactor_2;

public class Employee {
    private EmployeeType _type;
    private int _monthlySalary;
    private int _commission;
    private int _bonus;

    Employee(int type) {
        setType(type);
    }

    void setType(int arg) {
        _type = EmployeeType.newType(arg);
    }

    int getType() {
        return _type.getTypeCode();
    }

    int payAmount() {
        return _type.payAmount(this);
    }

    int getMonthlySalary() {
        return _monthlySalary;
    }

    int getCommission() {
        return _monthlySalary;
    }

    int getBonus() {
        return _bonus;
    }

}
