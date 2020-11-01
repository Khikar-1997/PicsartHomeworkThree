package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 4
        //Create an array and fill it. Print all elements which can be divided by 5.

        int[] array = {15, 17, 109, 100, 187, 165, 145};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0){
                System.out.print(array[i] + ",");
            }
        }
    }
}
