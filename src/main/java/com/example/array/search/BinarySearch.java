package com.example.array.search;

/**
 * <b>Note :</b> For performing Binary Search , Condition is <b>The array/List should be Sorted</b>
 */

public class BinarySearch {

    private static int usingLoopBinarySearch(int[] arr , int key ){

        int l=0 , r=arr.length-1  ;  // arr =[ 1, 3, 5, 7, 9, 11 ,13]

        int mid ;                    //        l         mid       r    ( 'l' means 'left' and 'r' means 'right' )

        while (l <= r){

            mid= (r+l)/2 ;

            if (key == arr[mid]) return arr[mid] ;

            if (key < arr[mid]) { r = mid - 1; }

            if (key > arr[mid] ){ l=mid+1 ; }
        }

        return -1 ;

    }




    private static int usingRecursionBinarySearch(int[] arr, int key  ,  int left , int right ){

        int mid = (left+right)/2;

        if(left <= right) {

            if (key == arr[mid]) return arr[mid];

            if (key < arr[mid]) return usingRecursionBinarySearch(arr, key, left, mid - 1);

            if (key > arr[mid]) return usingRecursionBinarySearch(arr, key, mid + 1, right);
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11 ,13};
//        int result = usingLoopBinarySearch(arr,11) ;
        int result = usingRecursionBinarySearch(arr,111,0,arr.length-1) ;
        System.out.println(result);
    }

}
