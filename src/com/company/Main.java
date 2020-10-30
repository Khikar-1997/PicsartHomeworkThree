package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 2
        //Create an array and fill it with numbers from 1:1000.
        int[] array = new int[1001];

        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + ",");
        }
    }
}
