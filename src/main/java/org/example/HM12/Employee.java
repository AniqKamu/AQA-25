package org.example.HM12;


public abstract class Employee {
        private final double baseSalary;
        private final String name;

        public Employee(double baseSalary, String name) {
            this.baseSalary = baseSalary;
            this.name = name;
        }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public abstract double getSalarys(Month month);
}
