package com.example;

public class FizzBuzz {
    public static boolean digitContains(int num, int digit){
        String numberAsString = String.valueOf(num);
        String digitAsString = String.valueOf(digit);

        return numberAsString.contains(digitAsString);
    }

    public static void fizzBuzz(int num) {

        boolean containsThree = digitContains(num, 3);
        boolean containsFive = digitContains(num, 5);
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if (num % 3 == 0 || containsThree) {
            System.out.println("FIZZ");
        } else if (num % 5 == 0 || containsFive) {
            System.out.println("BUZZ");
        } else {
            System.out.println("NADA");
        }
    }
}
