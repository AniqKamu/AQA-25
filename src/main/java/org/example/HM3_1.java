package org.example;

public class HM3_1 {
    public static void main(String[] args) {
        //Task #1
        int a = 11;
        int b = 2;
        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        //Task #2
        int c = 11;
        int d = 22;
        if ((c + d) % 2 == 0) {
            System.out.println("some variable is odd");
        } else {
            System.out.println("maybe a and b are even");
        }
        //Task #3
        int e = 75;
        if (e > 10) {
            System.out.println("More than 10");
        }
        if (e > 100) {
            System.out.println("Less than 100");
        }
        if (e / 2 > 20) {
            System.out.println("The result of division by 2 is greater than 20");
        }
        if (e >= 5 & e <= 40) {
            System.out.println("The value of the variable is between 5 and 40 inclusive");
        } else {
            System.out.println("The value of the variable is less than 5 or greater than 40");
        }
    }
}
