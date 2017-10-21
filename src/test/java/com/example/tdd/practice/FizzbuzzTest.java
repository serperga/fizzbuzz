package com.example.tdd.practice;

import org.junit.Assert;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import static org.hamcrest.core.Is.is;

public class FizzbuzzTest {

    @Test
    public void whenFizzBuzzIs1(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(1);
        Assert.assertThat(result, is("1") );
    }

    @Test
    public void whenFizzBuzzIs2(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(2);
        Assert.assertThat(result, is("2") );
    }

    @Test
    public void whenFizzBuzzIs3(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(3);
        Assert.assertThat(result, is("fizz") );
    }

    @Test
    public void whenFizzBuzzIs4(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(4);
        Assert.assertThat(result, is("4") );
    }

    @Test
    public void whenFizzBuzzIs5(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(5);
        Assert.assertThat(result, is("buzz") );
    }

    @Test
    public void whenFizzBuzzIs6(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(6);
        Assert.assertThat(result, is("fizz") );
    }

    @Test
    public void whenFizzBuzzIs10(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(10);
        Assert.assertThat(result, is("buzz") );
    }

    @Test
    public void whenFizzBuzzIs15(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(15);
        Assert.assertThat(result, is("fizzbuzz") );
    }

    @Test
    public void whenFizzBuzzIs30(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.execute(30);
        Assert.assertThat(result, is("fizzbuzz") );
    }
}
