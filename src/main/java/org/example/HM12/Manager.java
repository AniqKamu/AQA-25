package org.example.HM12;

public class Manager extends Employee{
    public Manager(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public double getSalarys(Month month) {
        return getBaseSalary() * month.getWorkingDays() * 1.1;
    }
}
