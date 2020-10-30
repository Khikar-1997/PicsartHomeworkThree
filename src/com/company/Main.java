package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 3
        //Create an array and fill it with odd numbers from -20:20

        int countOfOddNumbers = 0;

        for (int i = -19; i < 20; i += 2) {
            countOfOddNumbers++;
        }

        int[] array = new int[countOfOddNumbers];

        for (int j = 0, i = -19; j < array.length; i += 2, j++) {
            array[j] = i;
            System.out.print(array[j] + ",");
        }
    }
}
