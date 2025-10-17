package org.example.HM8.Task2;

public class Employee {
    String name;
    double  salary;
    int children;

    public Employee (String name, double salary, int children) {
        this.name = name;
        this.salary = salary;
        this.children = children;
    }
}



//Create an Employee class that stores information about an employee: name, monthly salary, and number of children.
//
//Create a TaxPayment class that will store the employee's name and the amount of income tax they must pay.
//
//Create a static method that will receive an array of employees and return
//        (or print, but returning is preferable) an array of tax payments (TaxPayment) according to the following rule:
//If the salary is greater than 10,000, the tax rate is 23%
//If the salary is between 5,000 and 10,000, the tax rate is 18%
//If the salary is less than 5,000, the tax rate is 13%
//For each child, 1,000 is deducted from the salary, and the tax is taken from the remaining amount.