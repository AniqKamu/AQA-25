package org.example;

public class HM5 {
    public static void main(String[] args) {
       //Task #1
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        System.out.println("_____________________________");

        //Task #2
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println(max);

        System.out.println("_____________________________");

        //Task #3
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }
        System.out.println(min);

        System.out.println("_____________________________");

         //Task #4
        int sum2 = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        double avr = sum2 * 1.0 / arr.length;
        System.out.println(avr);

        System.out.println("_____________________________");

        //Task #6
        int[][] ar = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum3 = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum3 += ar[i][j];
            }
        }
        System.out.println(sum3);

        System.out.println("_____________________________");

        //Task #7
        int[][] ar1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxi = ar1[0][0];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
               if (ar1[i][j] > maxi) {
                   maxi = ar[i][j];
               }
            }
        }
        System.out.println(maxi);

        System.out.println("_____________________________");

        //Task #8
        int[][] ar2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int mini = ar2[0][0];
        for (int i = 0; i < ar2.length; i++) {
            for (int j = 0; j < ar2[i].length; j++) {
                if (ar2[i][j] < mini) {
                    mini = ar[i][j];
                }
            }
        }
        System.out.println(mini);

    }
}
