package com.example.tdd.practice;

public class Fizzbuzz {

    public String execute(int i) {

        String result = "";

        if (isFizzBuzz(i)){
            result = util.FIZZBUZZ_STRING;
        } else if (isFizz(i)){
            result = util.FIZZ_STRING;
        } else if (isBuzz(i)){
            result = util.BUZZ_STRING;
        } else {
            result = String.valueOf(i);
        }

        return result;
    }

    private boolean isFizz(int number){
        boolean fizz = false;
        if (number%util.FIZZ == 0){
            fizz = true;
        }
        return fizz;
    }

    private boolean isBuzz(int number){
        boolean buzz = false;
        if (number%util.BUZZ == 0){
            buzz = true;
        }
        return buzz;
    }

    private boolean isFizzBuzz(int number){
        boolean fizzbuzz = false;
        if (number%util.FIZZBUZZ == 0){
            fizzbuzz = true;
        }
        return fizzbuzz;
    }
}
