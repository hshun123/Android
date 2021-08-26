package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val mon = SuperMonster1(100, 10)
    val night = SuperNight1(130, 80)

    mon.attack(night)
    mon.bite(night)
}

/*
 open class Monster1(var hp: Int, val power: Int) {
    fun attack() {

    }

    fun defense() {

    }
}

open class Night1(var hp:Int, val power: Int) {
    fun attack() {

    }

    fun defense() {

    }
}
*/

open class Charactor(var hp: Int, val power: Int) {

    fun attack(charactor: Charactor, power: Int = this.power) {
        charactor.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName} for $hp of energy last")
        else println("It is dead")
    }
}

class SuperNight1(hp: Int, power: Int) : Charactor(hp, power) {
    val defensepower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensepower)
    }
}

class SuperMonster1(hp: Int, power: Int) : Charactor(hp, power) {
    fun bite(charactor: Charactor) {
        super.attack(charactor, power + 2)
    }
}