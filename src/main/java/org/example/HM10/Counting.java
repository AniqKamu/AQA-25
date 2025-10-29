package org.example.HM10;

public class Counting {

    public static void main(String[] args) {
        Worker w = new Worker(1000, "Ivan");
        Manager m = new Manager( 1000, "Olga", 10);
        Director d = new Director(1000, "Rosa", 20);

        Employee[] employees = { w, m, d };
        Manager[] managers = { m, d };

        System.out.println("По имени: " + EmployeeUtils.findByName(employees, "Ivan").getName());
        System.out.println("Бюджет зарплат: " + EmployeeUtils.getSalaryBudget(employees));
        System.out.println("Мин. зарплата: " + EmployeeUtils.findMinSalary(employees));
        System.out.println("Макс. зарплата: " + EmployeeUtils.findMaxSalary(employees));
        System.out.println("Мин. подчинённых: " + EmployeeUtils.findMinSubordinates(managers));
        System.out.println("Макс. подчинённых: " + EmployeeUtils.findMaxSubordinates(managers));
        System.out.println("Мин. надбавка: " + EmployeeUtils.findMinBonus(managers));
        System.out.println("Макс. надбавка: " + EmployeeUtils.findMaxBonus(managers));

    }
}
