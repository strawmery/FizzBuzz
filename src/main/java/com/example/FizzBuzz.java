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
        if (num % 3 == 0 && num % 5 == 0) {//the number is divisible by 3 and 5
            System.out.println("FIZZBUZZ");
        } else if (num % 3 == 0 || containsThree) {//the number ius divisible by 3
            System.out.println("FIZZ");
        } else if (num % 5 == 0 || containsFive) {//the number is divisible by 5
            System.out.println("BUZZ");
        } else {
            System.out.println("NADA");
        }
    }
}
