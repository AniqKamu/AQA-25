package org.example.HM12;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Worker(100, "Alice"),
                new Manager(120, "Bob"),
                new Director(150, "Carol")
        };

        Month[] months = {MonthUtils.JANUARY, MonthUtils.FEBRUARY, MonthUtils.MARCH};

        double total = SalaryUtils.getTotalSalary(employees, months);
        System.out.println("Общая сумма к выплате: " + total);
    }
}
