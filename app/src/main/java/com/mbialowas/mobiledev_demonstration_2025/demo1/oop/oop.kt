package com.mbialowas.mobiledev_demonstration_2025.demo1.oop

fun main() {
    var shark = Animal("Shark", "Chomping")
    var monkey = Animal("Monkey", "Squealing")

    println(shark.makeSound())
    println(monkey.makeSound())

    val bird = Bird("Sparrow", "Chirping")
    bird.makeSound()
    bird.fly()

    val gorilla = Gorilla("Gorilla", "Growling")
    gorilla.getBananas()
    gorilla.makeSound()
}


