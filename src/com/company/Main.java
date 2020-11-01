package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 5
        //Create an array and fill it. Print all elements which are between 24.12 and 467.23.

        double[] array = new double[500];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 24.12 && array[i] < 467.23) {
                System.out.print(array[i] + ",");
            }
        }
    }
}
