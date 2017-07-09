package com.example.task01;

public class Fibonacci {
    public int fibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibonacci(0);
        if(result == 0) {
            System.out.println("Działa dla 0");
        } else {
            System.out.println("Nie działa dla 0");
        }
        result = fibonacci.fibonacci(4);
        if(result == 3) {
            System.out.println("Działa dla 4");
        } else {
            System.out.println("Nie działa dla 4");
        }
    }
}
