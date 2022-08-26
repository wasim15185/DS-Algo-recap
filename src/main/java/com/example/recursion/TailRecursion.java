package com.example.recursion;


/**
 * <b>What is Tail Recursion ? </b>
 *
 * Ans : If <b>Recursive-Call</b> is the <b>Last-Statement</b> of a Recursive Function then that Recursive Function called TailRecursion
 *
 */


public class TailRecursion {

    private static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1); // This is called 'Recursive-Call' and this 'Recursive-Call' is 'Last Statement' of fun(int n) so it is Tail-Recursion
        }
    }

    public static void main(String[] args) {
        fun(3);
    }

}
