package org.example;

public class HM2 {
    public static void main(String[] args) {
        //Задача №1
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        if (a % 2 == 0) {
            System.out.println("четные");
        } else {
            System.out.println("нечетные");
        }
        if (b % 2 == 0) {
            System.out.println("четные");
        } else {
            System.out.println("нечетные");
        }

        //Задача №2
        int c = 10;
        int d = 5;
        System.out.println("c = " + c + ", d = " + d);
        int e = c;
        c = d;
        d = e;
        System.out.println("c = " + c + ", d = " + d);

        //Задача №3
        int coins = 1268;
        int team = 5;
        int owner = coins / 2;
        int cap = (coins / 2) / 2;
        int jackSparrow = owner + cap;
        int revenue = (coins - jackSparrow) / team;
        System.out.println("Награбленное для одного члена команды: " + revenue);
        System.out.println("Хозяин корабля получает: " + owner);
        System.out.println("Капитан корабля получает: " + cap);
        System.out.println("Джек получает: " + jackSparrow);

    }
}