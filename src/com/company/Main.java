package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, k = array[i]; j < 1000; j++, k /= 2) {
                if (k % 2 == 0) {
                    if (k == 2) {
                        System.out.print(array[i] + ",");
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println("\n                     OR");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 1000; j++) {
                if (array[i] != 0 && (array[i] & (array[i] - 1)) == 0) {
                    System.out.print(array[i] + ",");
                    break;
                }
            }
        }
    }
}
