package com.modeln.replace_type_code_with_state.refactor_1;

public class Employee {
    private int _type;
    private int _monthlySalary;
    private int _commission;
    private int _bonus;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee(int type) {
        setType(type);
    }

    void setType(int type) {
        _type = type;
    }

    int getType() {
        return _type;
    }

    int payAmount() {
        switch(getType()) {
            case ENGINEER:
                return _monthlySalary;
            case SALESMAN:
                return _monthlySalary + _commission;
            case MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
