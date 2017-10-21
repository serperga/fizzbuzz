package com.example.tdd.practice;

public class ExecuteFizzbuzz {

    public static void main(String[] args){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        for (int i=1;i<=100;i++){
            String result = fizzbuzz.execute(i);
            System.out.println(result);
        }
    }
}
