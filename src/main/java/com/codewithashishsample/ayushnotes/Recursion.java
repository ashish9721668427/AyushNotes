package com.codewithashishsample.ayushnotes;

public class Recursion {

    public static void main(String[] args) {
        int result = fib(5);
        System.out.println(result);
    }

    static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        } else {
            int x = fib(n - 1);
            int y = fib(n - 2);
            return x + y;
        }
    }
}