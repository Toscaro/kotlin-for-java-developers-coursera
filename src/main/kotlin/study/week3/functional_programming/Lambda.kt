package study.week3.functional_programming

import java.awt.Button
import java.awt.event.ActionListener

data class Animal(val name: String, val age: Int)

fun main() {
    val button = Button()
    anonymousClass(button)
    lambda(button)
    lambdaInCollection()
}


fun anonymousClass(button: Button) {
    button.addActionListener(ActionListener {
        println("wow!")
    })
}

fun lambda(button: Button) {
    button.addActionListener { println("wow!") }
}

fun lambdaInCollection() {
    val animals: List<Animal> = listOf(Animal("Dog", 12), Animal("Cat", 9))
    println(animals.filter { it.name == "Dog" }.map { it.age }.average())
}