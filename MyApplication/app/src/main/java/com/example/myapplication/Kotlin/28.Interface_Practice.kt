package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val student1 : Student__ = Student__()
    student1.eat()
    student1.sleep()

}

interface Person__ {
    fun eat() {
        println("Eating")
    }
    fun sleep() {
        print("Sleeping")
    }
    abstract fun study()
}


class Student__ : Person__ {
    override fun study() {
        TODO("Not yet implemented")
    }
}

class SoccerPlyaer_ : Person__ {
    override fun study() {
        TODO("Not yet implemented")
    }
}
