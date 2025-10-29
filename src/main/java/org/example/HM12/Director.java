package org.example.HM12;


public class Director extends Employee{
    public Director(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public double getSalarys(Month month) {
        return getBaseSalary() * month.getWorkingDays() * 1.2;
    }
}
