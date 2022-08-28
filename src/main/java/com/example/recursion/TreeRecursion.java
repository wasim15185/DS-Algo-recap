package com.example.recursion;

public class TreeRecursion {
    private static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1); // -----+
                         //      |  ----- See this "Recursive-Call" appears more than 1 time
            fun(n-1); // -----+

        }
    }

    public static void main(String[] args) {
        fun(3);
    }

}
