package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val suc = SuperCar100()


    println(suc.drive())
}

// class is set as private by default
open class Car100() {
    open fun drive(): String {
        //println("It is running")
        return "It is running"
    }

    fun stop() {

    }
}

class SuperCar100() : Car100() {
    override fun drive(): String {
        //println("Run as fast as fuck")
        val result = super.drive()

        return "$result as fast as fuck"
    }
}

class Truck() : Car100() {

}

class Bus() {

}