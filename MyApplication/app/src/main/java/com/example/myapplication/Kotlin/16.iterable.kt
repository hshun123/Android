package com.example.myapplication.Kotlin

fun main(args: Array<String>){

    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)


    // 반복하는 방법

    for (item in a) {
        if (item == 5){
            println("Item is Five")
        }
        else{
            println("Item is not Five")
        }
    }

    // 반복하는 방법2

    for ((index, item) in a.withIndex()) {
        println("index: " +  index + " value: " + item)
    }

    // 3

    a.forEach{
        println(it)
    }

    // 4

    a.forEach { item ->

        println(item)

    }

    // for each with index 5

    a.forEachIndexed{
            index, item ->

        println("index: " +  index + " value: " + item)
    }

    // for loop 6

    for ( i in 0 until a.size) {
        println(a.get(i))
    }

    //7

    for (i in 0 until a.size step(2)){
        println(a.get(i))
    }

    // 8
    for ( i in a.size - 1 downTo (0)){
        println(a.get(i))
    }

    // 9

    // 10

    println()
    for (i in 0 .. 10){ // contains 10
        println(i)
    }


    // 11

    var b = 0
    var c = 4

    while (b < c) {
        b++
        println(b)
    }
}