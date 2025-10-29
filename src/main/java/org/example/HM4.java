package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HM4 {
    public static void main(String[] args) {
        //Task #1
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            int arr = array[i];
            if (arr % 2 != 0) {
                System.out.println(arr);
            }
        }
        System.out.println("_______________________________");
        //Task #2
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array1.length; i++) {
            int arr1 = array1[i];
            if (arr1 > 5) {
                System.out.println(arr1);
            }

        }
        System.out.println("____________________________");

        //Task #3
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int j = 0; j < array2.length; j++) {
            array2[j] = array2[j] + 15;
                System.out.println(array2[j] + " ");
            }
        System.out.println("____________________________");

        //Task #4
        String s = "Перестановочный алгоритм быстрого действия";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                result.append('о');
            }
        }
        System.out.println(result);

        System.out.println("____________________________");

        //Task #5
        String s1 = "Перевыборы выбранного президента";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
                res.append('е');
            }
        }
        System.out.println(res.length());

        System.out.println("____________________________");

        //Task #6
        int sum = 0;
        int[] arrAr = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < arrAr.length; i++) {
            int a = arrAr[i];
            sum += a;
        }
        System.out.println(sum);

        System.out.println("____________________________");

        //Task #6


        int deltaMax = 3;
        int sum1 = 0;
        int[] arrAr2 = {60, 59, 58, 59, 64, 60, 60, 59, 58, 59, 64, 60, 60, 59, 58, 59, 64, 60, 59, 58};

        for (int i = 0; i < arrAr2.length; i++) {
            sum1 += arrAr2[i];
        }
        double avr = sum1 * 1.0 / arrAr2.length;
        System.out.println(avr);
        for (int inBox : arrAr2) {
            double delta = Math.abs(avr - inBox);
            if (delta > deltaMax) {
                System.out.println(delta);
            }
        }

    }
    }
