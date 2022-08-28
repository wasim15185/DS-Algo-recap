package com.example.array.search

/**
 * Using Loop
 */
private fun usingLoopBinarySearch(arr: IntArray, key: Int): Int {
    var l = 0
    var r = arr.size - 1 // arr =[ 1, 3, 5, 7, 9, 11 ,13]
    var mid: Int //        l         mid       r    ( 'l' means 'left' and 'r' means 'right' )
    while (l <= r) {
        mid = (r + l) / 2
        if (key == arr[mid]) return arr[mid]
        if (key < arr[mid]) {
            r = mid - 1
        }
        if (key > arr[mid]) {
            l = mid + 1
        }
    }
    return -1
}

/**
 * Using Recursion
 */
private fun usingRecursionBinarySearch(arr: IntArray, key: Int, left: Int, right: Int): Int {
    val mid = (left + right) / 2
    if (left <= right) {
        if (key == arr[mid]) return arr[mid]
        if (key < arr[mid]) return usingRecursionBinarySearch(arr, key, left, mid - 1)
        if (key > arr[mid]) return usingRecursionBinarySearch(arr, key, mid + 1, right)
    }
    return -1
}



fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9, 11, 13)
    //        int result = usingLoopBinarySearch(arr,11) ;
    val result = usingRecursionBinarySearch(arr, 111, 0, arr.size - 1)
    println(result)
}