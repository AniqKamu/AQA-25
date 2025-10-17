package org.example.HM8.Task2;

public class TaxPayment {
    String employeeName;
    double taxAmount;

    TaxPayment(String employeeName, double taxAmount) {
        this.employeeName = employeeName;
        this.taxAmount = taxAmount;
    }

    void print() {
        System.out.println(employeeName + " need to pay tax: " + taxAmount);
    }
}
