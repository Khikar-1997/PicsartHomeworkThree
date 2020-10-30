package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 2, 2, 2, 2};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("\n      OR");

        int[] array1 = new int[10];
        for (int i = 0, j = 2; i < array1.length; i++) {
            array1[i] = j;
            System.out.print(array1[i] + ",");
        }
    }
}
