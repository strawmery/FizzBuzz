package com.example;

public class FizzBuzz 
{
    public static void fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {//the number is divisible by 3 and 5
            System.out.println("FIZZBUZZ");
        } else if (num % 3 == 0) {//the number ius divisible by 3
            System.out.println("FIZZ");
        } else if (num % 5 == 0) {//the number is divisible by 5
            System.out.println("BUZZ");
        } else {//the number doesen't apply with the conditions
            System.out.println("NADA");
        }
    }
}
