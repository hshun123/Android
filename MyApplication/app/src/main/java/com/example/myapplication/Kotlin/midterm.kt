package com.example.myapplication.Kotlin

// 1

fun main(args: Array<String>) {


}

class Claculator() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun mul(a: Int, b: Int): Int {
        return a * b
    }
    fun divide(a: Int, b: Int): Int {
        return a / b
    }
}

class Calculator2() {

    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach {
            result += it
        }

        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = 0

        for (i in 0 until numbers.size) {
            result = result - numbers[i]
        }
        return result
    }
}

class Cal3(val initialValue: Int) {

    fun plus(num: Int): Cal3 {
        var result = 0

        result = this.initialValue + num

        return Cal3(result)
    }

    fun minus(num: Int): Cal3 {
        var result = 0

        result = this.initialValue - num

        return Cal3(result)
    }

    fun mul(num: Int): Cal3 {
        var result = 0

        result = this.initialValue * num

        return Cal3(result)
    }

    fun divide(num: Int): Cal3 {
        var result = 0

        result = this.initialValue / num

        return Cal3(result)
    }
}

// Make a bank account

class Account(val name: String, val birth: String, var balance: Int) {

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount : Int): Boolean {
        if (balance >= amount){
            balance = balance - amount
            return true
        }else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account2 {
    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth

        if (balance >=0 ) {
            this.balance = balance
        }else{
            this.balance = 0
        }
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount : Int): Boolean {
        if (balance >= amount){
            balance = balance - amount
            return true
        }else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

// Tv

class Tv(val channels: List<String>) {

    var onOff: Boolean = false
    var currentCahnnelNumber = 0

    fun switch() {
        onOff = !onOff
    }
}