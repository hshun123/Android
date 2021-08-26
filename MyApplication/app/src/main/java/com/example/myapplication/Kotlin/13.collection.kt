package com.example.myapplication.Kotlin

// collection

// list, set, map

// list

fun main(args: Array<String>) {

    // immutable collections
    // List
    val numberList  = listOf<Int>(1,2,3)

    println(numberList)
    println(numberList[0])
    // Set
    val numberSet = setOf<Int>(1,2,3,4,3,3,3)

   numberSet.forEach{
       println(it)
   }


    // map -> key, value

    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)

    println(numberMap.get("one"))

    // Mutable collections

    val mNum = mutableListOf<Int>(1,2,3)

    mNum.add(4)

    println(mNum )
}