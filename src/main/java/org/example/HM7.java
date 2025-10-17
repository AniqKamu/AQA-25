package org.example;

public class HM7 {
    public static boolean isLove(final int flower1, final int flower2) {
//        Timmy & Sarah think they are in love, but around where they live,
//        they will only know once they pick a flower each.
//        If one of the flowers has an even number of petals
//        and the other has an odd number of petals it means they are in love.
//        Write a function that will take the number of petals of each flower
//        and return true if they are in love and false if they aren't.
        return (flower1 % 2 == 0 && flower2 % 2 != 0) ||
                (flower1 % 2 != 0 && flower2 % 2 == 0);
        }

    public static int findSmallestInt(int[] args) {
//        Given an array of integers your solution should find the smallest integer.
//        For example:
//        Given [34, 15, 88, 2] your solution will return 2
//        Given [34, -345, -1, 100] your solution will return -345
//        You can assume, for the purpose of this kata, that the supplied array will not be empty.

        int min = args[0];
        for (int x : args){
            if (x < min) min = x;
        }
        return min;
    }

    public static String countingSheep(int num) {
//        Given a non-negative integer, 3 for example,
//        return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
//        Input will always be valid, i.e. no negative integers.

        String result = "";

        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }

        return result;
    }

    public static void main(String[] args) {
        sum(5, 8);
        subtraction(15, 5);
        System.out.println(multi(2, 4));
        System.out.println(division(20, 6));
        System.out.println(isLove(60, 8));
        int[] numbers = {34, 15, 88, 2, -25};
        System.out.println(findSmallestInt(numbers));
        System.out.println(countingSheep(3));
    }

    public static void sum(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void subtraction(int a, int b){
        System.out.println(a - b);
    }

    public static int multi(int a, int b){
        return a * b;
    }

    public static double division(int a, int b){
        return (double) a / b;
    }
}
