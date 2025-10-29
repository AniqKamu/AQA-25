package org.example.HM12;


public class SalaryUtils {
    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double total = 0;

        for (Employee employee : employees) {
            for (Month month : months) {
                total += employee.getSalarys(month);
            }
        }

        return total;
    }
}
