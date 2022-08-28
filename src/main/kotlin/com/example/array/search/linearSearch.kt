package com.example.array.search

/**
 * Linear Search means simple searching Technique .
 */



private fun search(arr: IntArray, key: Int): Boolean {
    for (i in arr.indices) {
        if (arr[i] == key) return true
    }
    return false
}


fun main( ) {
    search(intArrayOf(1, 3, 9, 2, 4, 7, 0), 4)
}
