package com.example.task01;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dominik on 2017-07-10.
 */
public class FibonacciTest {

@Test
    public void testFinobacci(){
        Fibonacci fib = new Fibonacci();
        int test=fib.fibonacci(6);
        int reuslts = 8;


        Assert.assertEquals(reuslts,test);



    }



}