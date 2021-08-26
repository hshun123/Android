package com.example.myapplication.Kotlin

//27 Interface
// No constructor -> No instance ->
// Need to implement the methods

fun main(args: Array<String>) {
    val student1 : Student_ = Student_()
    student1.eat()
    student1.sleep()

}

interface Person_ {
    fun eat()
    fun sleep()
}


class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlyaer : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}


open class Person() {
    fun eat() {

    }

    fun sleep() {

    }
}

class Student() : Person() {

}

class Teacher() : Person() {

}