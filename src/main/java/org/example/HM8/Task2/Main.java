package org.example.HM8.Task2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan", 12000, 2),
                new Employee("Olga", 8000, 1),
                new Employee("Sergey", 4000, 0)
        };

        TaxPayment[] taxes = TaxCalculator.calculateTaxes(employees);

        for (int i = 0; i < taxes.length; i++) {
            taxes[i].print();
        }

        double totalSalary = Salary.getSum(employees);
        System.out.println("Total Salary: " + totalSalary);
    }
}
