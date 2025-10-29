package org.example.HM12;


public class Worker extends Employee {
    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public double getSalarys(Month month) {
        return getBaseSalary() * month.getWorkingDays();
    }
}
