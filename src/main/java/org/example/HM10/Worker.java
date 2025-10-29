package org.example.HM10;

public class Worker extends Employee{

    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
