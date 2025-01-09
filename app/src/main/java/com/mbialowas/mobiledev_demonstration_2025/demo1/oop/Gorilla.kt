package com.mbialowas.mobiledev_demonstration_2025.demo1.oop

class Gorilla(type: String, sound:String) : Animal(type, sound){
    init {
        println("Gorilla created")
    }
    fun getBananas() {
        println("Gorilla is eating bananas")
    }
}