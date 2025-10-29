package org.example.HM8.Task2;

//Task #3
//
//We need to create a Salary class with a single static method, getSum(Employee[] employeeArray),
//which should return the sum of the salaries of all employees in the array passed as an argument to the method call.

public class Salary {
    static double getSum(Employee[] employeeArray) {
        double sum = 0;

        for(int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].salary;
        }
        return sum;
    }

}
