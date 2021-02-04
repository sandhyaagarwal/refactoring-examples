package com.modeln.replace_type_code_with_subclasses.refactor_2;

public abstract class Employee {
    private int _monthlySalary;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract int getType();

    abstract int payAmount();

    int getMonthlySalary() {
        return _monthlySalary;
    }

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

}
