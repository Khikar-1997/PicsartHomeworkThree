package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 7, 5};

        for (int i = 0; i < array.length; i++) {
            int k;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    k = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = k;
                }
            }
        }

        for (int j : array) {
            System.out.println(j);
        }
    }
}
