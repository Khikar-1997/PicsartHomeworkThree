package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 6
        //Create an array and fill it. Print count of elements which can be divided by 2.

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
    }
}
