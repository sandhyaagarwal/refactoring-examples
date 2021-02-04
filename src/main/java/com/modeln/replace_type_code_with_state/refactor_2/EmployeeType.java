package com.modeln.replace_type_code_with_state.refactor_2;

abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static EmployeeType newType(int code) {
        switch(code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }

    abstract int getTypeCode();
    abstract int payAmount(Employee emp);
}
