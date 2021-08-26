package com.example.myapplication.Kotlin

// 29. generic

fun main(args: Array<String>) {
    val list1 = listOf(1,2,3,"hello")

    val b: String = list1[2].toString()

    // type safe
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2]

    // check strong type
    val list3 = listOf(1,2,3,4,"a", "v", 3.0)
    val list4 = listOf<Int>(1,2,3) //
}

