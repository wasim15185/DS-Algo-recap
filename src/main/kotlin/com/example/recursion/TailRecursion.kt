package com.example.recursion

private fun meth(n: Int) {
    if (n > 0) {
        println(n)
        meth(n - 1) // This is called 'Recursive-Call' and this 'Recursive-Call' is 'Last Statement' of `meth(int n)` so it is Tail-Recursion
    }
}


fun main(args: Array<String>) {
    meth(3)
}
