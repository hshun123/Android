package com.example.myapplication.Kotlin

fun main(args: Array<String>) {

    val test = TestAccess("James")
    println(test.name)
    test.test()

    //
    val night = Night(20, 4)
    val monster = Monster(15, 3)

    night.attack(monster)
    monster.attack(night)

    //night.hp = 100 // This should not be allowed
    // println(night.hp)
}

class TestAccess{
     var name: String = "sam"

    constructor(name: String) {
        this.name = name
    }

    fun test() {
        println("Test")
    }

}

class Night( private var hp: Int, var power: Int) {
    fun attack(monster: Monster) {
        monster.defense(power)

    }

    fun defense(damage: Int){
        hp -= damage

        if(hp > 0){
            heal()
            println("Current hp is $hp")
        }
        else println("Night is dead")

    }

    fun heal() {
        hp += 3

    }
}

class Monster(private var hp: Int, var power:Int) {
    fun attack(night: Night) {
        night.defense(power)

    }

    fun defense(damage: Int){
        hp -= damage

        if(hp > 0) println("Current hp is $hp")
        else println("Monster is dead")
    }
}