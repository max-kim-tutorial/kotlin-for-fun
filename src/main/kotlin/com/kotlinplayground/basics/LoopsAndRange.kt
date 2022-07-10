package com.kotlinplayground.basics

class LoopsAndRange {
}

// executable class
fun main() {
    val range = 1..10 // 1~10 range
    for (i in range) {
        println("i : $i")
    }

    val reverseRange = 10 downTo 1 // 10~1 range
    for (i in reverseRange) {
        println("reverseRange : $i")
    }

    for (i in reverseRange step 2) { // 2씩 올라감
        println("reverseRange with skip: $i")
    }
    exploreWhile()
    exploreDoWhile()
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("value of x is $x")
        x++
    }
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of i is: $i")
        i++
    } while(i < 5)
}