package com.example.myapplication.Kotlin

fun main(args:Array<String>){
    val a = 5
    val b = 10

    // when

    val value: Int = 3

    when(value){
        1 -> {
            println("value is one")
        }

        2 -> {
            println("value is two")
        }
        3 -> {
            println("value is three")
        }

        else -> {
            println("value is others")
        }
    }

    val value3: Int = 3
    when(value3){
        is Int -> {
            println("value3 is int")
        }
        else -> {
            println("vlaue3 is not int")
        }

    }

    val value5: Int = 98

    when(value5){
        in 60..90 -> {
            println("value5 is in 60 ~ 90")
        }
    }
}