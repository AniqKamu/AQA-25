package org.example;

public class HM3_2 {
    public static void main(String[] args) {
        //Task #1
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }

        //Task #2
        int num = 5;
        int result = 1;
        int power = 1;
        while (result < 10000) {
            result = (int) Math.pow(num, power);
            if (result < 10000) {
                System.out.println(num + " in power " + power + " equal " + result);
            }
            power++;
        }
        //Task #3
        for (int j = 40; j <= 60; j++) {
            if (j % 4 == 0) {
                System.out.println(j);
            }
        }
        System.out.println("-----------------------------------------");
        for (int l = 40; l <= 60; l += 4) {
            System.out.println(l);
        }
    }
}
