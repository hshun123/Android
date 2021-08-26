package com.example.myapplication.Kotlin

// array

fun main(args: Array<String>) {
    val one = 1
    val two = 2
    val three = 3
    val four = 4
    val five = 5

    var group = arrayOf<Int>(1,2,3,4,5,6)

    println(group is Array)

    var group2 = arrayOf(1,2,3,4, "hello")

    // access value

    println(group.get(0))
    println(group[0])

    // modify the value

    group.set(0, 100)
    println(group[0])

    group[0] = 200
    println(group[0])

    val arr = arrayOf<Int>(1,2,3)

    val number = arr.get(0)
    println(number)
    val number2 = arr.get(1)

    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('a', 'b', 'c')
    val a3 = doubleArrayOf(1.2, 3.4)
    val a4 = booleanArrayOf(true, false)

    val a5 = Array(5) { 1;2;3;4;5 }

    println(a5.get(0))
}