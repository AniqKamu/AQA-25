package org.example.HM10;

public class Director extends Manager{

    public Director(double baseSalary, String name, int getNumberOfSubordinates) {
        super(baseSalary, name, getNumberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() * (1 + (getNumberOfSubordinates() / 100.0 * 9));
        } else {
            return getBaseSalary();
        }

    }
}
