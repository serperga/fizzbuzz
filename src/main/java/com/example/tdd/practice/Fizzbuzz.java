package com.example.tdd.practice;

public class Fizzbuzz {

    public String execute(int i) {

        String result = "";

        if (isFizz(i)){
            result = util.FIZZ_STRING;
        }

        if (isBuzz(i)){
            result = result + util.BUZZ_STRING;
        }

        if (result.equals("")) {
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

}
