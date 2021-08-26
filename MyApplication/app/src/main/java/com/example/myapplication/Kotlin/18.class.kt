package com.example.myapplication.Kotlin

fun main(args: Array<String>) {

    // class
    val bigCar = Car("v8 engine", "big")

    val superCar = SuperCar("good engine", "big", "white")

    val runableCar =  RunableCar("good engine", "good body")

    runableCar.drive()
    runableCar.navi("Pusan")
    runableCar.ride()

    val rCar2 = RunableCar2("nice engine", "long body")

    println(rCar2.body)
    println(rCar2.engine)

    val tst = TestClass()

    tst.test(10)
    tst.test(10, 20)
}

// class 1
class Car(var engine: String, var body: String) {

}

// 2

class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String){
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// class 3 extension of 1

class Car1(engine: String, body: String) {
    var door: String = ""

    constructor(engine: String, body:String, door: String): this(engine, body) {
        this.door = door
    }
}

// 4
class Car2 {
    var engine:String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body   = body
        this.door   = door
    }

}

class RunableCar(engine: String, body: String) {

    fun ride() {
        println("on the ride")
    }

    fun drive(){
        println("It's running")
    }

    fun navi(destination: String) {
        println("$destination is set to the destination")
    }
}

class RunableCar2 {
    var engine: String = ""
    var body: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init { // Initialization
        println("Runable Car2 is made")
    }

    fun ride() {
        println("on the ride")
    }

    fun drive(){
        println("It's running")
    }

    fun navi(destination: String) {
        println("$destination is set to the destination")
    }

}

// overloading

class TestClass() {
    val a: Int = 10

    fun test(a: Int) {
        println("up")
    }

    fun test(a:Int, b: Int){
        println("down")
    }
}