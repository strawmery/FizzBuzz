package com.example;

public class FizzBuzz 
{
    public static void fizzBuzz (int num){
        if(num % 3 == 0){//number divisible by 3
            System.out.println("FIZZ");
        }else if (num % 5 == 0){//number divisible by 5
            System.out.println("BUZZ");
        }else if(num % 3 == 0 && num % 5 == 0){//number divisible by 3 and 5
            System.out.println("FIZZBUZZ");
        }else{
            System.out.println("NADA");//the number doesn't meet any of the conditions
        }
    }
}
