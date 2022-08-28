package com.example.recursion;

public class HeadRecursion {

    private static void fun(int n){
        if (n>0){
            fun(n-1); // This is called 'Recursive-Call' and this 'Recursive-Call' is 'First Statement' of fun(int n) so it is Head-Recursion
            System.out.println(n);

        }
    }

    public static void main(String[] args) {
        fun(3);
    }
}
