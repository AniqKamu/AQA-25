package org.example.HM8.Task2;

public class TaxCalculator {
    static TaxPayment[] calculateTaxes(Employee[] employees) {

        TaxPayment[] taxes = new TaxPayment[employees.length];

        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];

            double salaryAfterChildren = e.salary - e.children * 1000;
            if (salaryAfterChildren < 0) salaryAfterChildren = 0;

            double taxRate;
            if (salaryAfterChildren > 10000) {
                taxRate = 0.23;
            } else if (salaryAfterChildren >= 5000) {
                taxRate = 0.18;
            } else {
                taxRate = 0.13;
            }


            double taxAmount = salaryAfterChildren * taxRate;

            taxes[i] = new TaxPayment(e.name, taxAmount);
        }

        return taxes;
    }
}
