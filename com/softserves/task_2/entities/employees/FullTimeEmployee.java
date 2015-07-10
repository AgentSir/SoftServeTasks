package com.softserves.task_2.entities.employees;

public class FullTimeEmployee extends Employee {

    private double fixedPayment;

    public FullTimeEmployee(int id, String name, boolean isFixedPayment, double hourlyRate) {
        super(id, name, isFixedPayment);
        this.fixedPayment = hourlyRate;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

}
