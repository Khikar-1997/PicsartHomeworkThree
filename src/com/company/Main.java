package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 7
        //Given an integer, 0< N < 21 , print its first 10 multiples.
        //Each multiple N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.

        int number = 5;
        int result;
        if (number > 0 && number < 21) {
            for (int i = 1; i < 11; i++) {
                result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }
    }
}
