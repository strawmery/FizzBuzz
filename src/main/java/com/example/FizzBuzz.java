package com.example;

public class FizzBuzz 
{
    public static void fizzBuzz (int num){
        if(num % 3 == 0){
            System.out.println("FIZZ");
        }else if (num % 5 == 0){
            System.out.println("BUZZ");
        }else if(num % 3 == 0 || num % 5 == 0){
            System.out.println("FIZZBUZZ");
        }else{
            System.out.println("NADA");
        }
    }
}
