package com.example.myapplication.Kotlin

fun plus(f: Int, sec: Int): Int {
    val result = f + sec
    return result
}

fun plusM(vararg numbers: Int) {
    for (num in numbers) {
        println(num)
    }
}

fun main(args: Array<String>) {
//    println(plus(1, 2))
//
//    plusM(1,2,3,4,5)
    first()
    println(second(78))
    println(third(89))
    gugudan()
}

fun first() {
    val list1 = MutableList(9, {0})
    val list2 = MutableList(9, {true})

    for (i in 0..8){
        list1[i] = i + 1
    }

    for (i in 0..8) {
        list2[i] = list1[i] % 2 == 0
    }
    println(list1)
    println(list2)
}

fun second(score: Int): String {

    return when (score) {
        in 90..100 -> {
            "A"
        }
        in 80..90 -> {
            "B"
        }
        in 70..80 -> {
            "C"
        }
        else -> {
            "F"
        }
    }
}

fun third(num: Int): Int {
    val a = num / 10
    val b = num % 10

    return a + b
}

fun gugudan() {

    for (i in 1..9){
        for (j in 1..9){
            println("" + i + " x " + j + " = " + i * j)
        }
    }
}