package com.example.array.search;

/**
 * Linear Search means simple searching Technique .
 */


public class LinearSearch {

    private static boolean search(int[] arr , int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) return true;
        }
        return false ;
    }

    public static void main(String[] args) {
        search(new int[]{1,3,9,2,4,7,0}, 4);
    }
}
