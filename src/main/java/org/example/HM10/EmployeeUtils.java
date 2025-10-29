package org.example.HM10;

public class EmployeeUtils {
    // Поиск сотрудника по имени
    public static Employee findByName(Employee[] employees, String name) {
        for (Employee emp : employees) {
            if (emp != null && emp.getName().equals(name)) {
                return emp;
            }
        }
        return null;
    }

    // Поиск сотрудника по вхождению строки в имени
    public static void findBySubstringInName(Employee[] employees, String substring) {
        for (Employee emp : employees) {
            if (emp != null && emp.getName().contains(substring)) {
                System.out.println(emp.getName());
            }
        }
    }

    // Подсчет зарплатного бюджета
    public static double getSalaryBudget(Employee[] employees) {
        double sum = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    // Поиск минимальной зарплаты
    public static double findMinSalary(Employee[] employees) {
        double min = Double.MAX_VALUE;
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() < min) {
                min = emp.getSalary();
            }
        }
        return min;
    }

    // Поиск максимальной зарплаты
    public static double findMaxSalary(Employee[] employees) {
        double max = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() > max) {
                max = emp.getSalary();
            }
        }
        return max;
    }

    // Поиск минимального количества подчиненных
    public static int findMinSubordinates(Manager[] managers) {
        int min = Integer.MAX_VALUE;
        for (Manager m : managers) {
            if (m != null && m.getNumberOfSubordinates() < min) {
                min = m.getNumberOfSubordinates();
            }
        }
        return min;
    }

    // Поиск максимального количества подчиненных
    public static int findMaxSubordinates(Manager[] managers) {
        int max = 0;
        for (Manager m : managers) {
            if (m != null && m.getNumberOfSubordinates() > max) {
                max = m.getNumberOfSubordinates();
            }
        }
        return max;
    }

    // Поиск наибольшей надбавки (разницы между зарплатой и базовой ставкой)
    public static double findMaxBonus(Manager[] managers) {
        double max = 0;
        for (Manager m : managers) {
            if (m != null) {
                double bonus = m.getSalary() - m.getBaseSalary();
                if (bonus > max) {
                    max = bonus;
                }
            }
        }
        return max;
    }

    // Поиск наименьшей надбавки
    public static double findMinBonus(Manager[] managers) {
        double min = Double.MAX_VALUE;
        for (Manager m : managers) {
            if (m != null) {
                double bonus = m.getSalary() - m.getBaseSalary();
                if (bonus < min) {
                    min = bonus;
                }
            }
        }
        return min;
    }
}
