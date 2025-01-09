package com.mbialowas.mobiledev_demonstration_2025.demo1.oop

class Person {
    var name: String = "Rence Mayores"

    //getter and setter
    get() = field //field is the backing field
    set(value) {
        field = value
    } // setter

    // This is what to use *******************
    var age: Int = 23
        get() = field
        set(value) {field = value}
}

fun main() {
    var rence = Person()
    println(rence.name)
    println(rence.age)
}