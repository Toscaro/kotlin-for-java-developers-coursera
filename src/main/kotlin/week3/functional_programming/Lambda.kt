package week3.functional_programming

import java.awt.Button
import java.awt.event.ActionListener

data class Animal(val name: String, val age: Int)

fun main() {
    val button = Button()
    anonymousClass(button)
    lambda(button)
    lambdaSyntax()
    lambdaInCollection()
    lambdaDestructionDeclaration()
}

fun anonymousClass(button: Button) {
    button.addActionListener(ActionListener {
        println("wow!")
    })
}

fun lambda(button: Button) {
    button.addActionListener { println("wow!") }
}

fun lambdaSyntax() {
    // parameter1: Int, parameter2: Int is the lambda parameters
    // after -> we add the lambda body parameter1 + parameter2
    val lambdaTest = { parameter1: Int, parameter2: Int -> parameter1 + parameter2 }
    println(lambdaTest(0, 1))
    println(lambdaTest(1, 2))
    println(lambdaTest(2, 3))
    println()

    // Ways to use a lambda
    val listOf = listOf(0, 1, 2, 3)
    // Type omitted
    println(listOf.any { it == 0 })
    //Declaring the val name and type
    println(listOf.any { number: Int -> number > 2 })
    //Declaring the val name
    println(listOf.any { number -> number < 0 })
    //Multi-line lambda, the last line is the return line.
    println(listOf.any {
        println("Trying the number $it")
        it > 0
    })
}

fun lambdaInCollection() {
    val animals: List<Animal> = listOf(Animal("Dog", 12), Animal("Cat", 9))
    println(animals.filter { it.name == "Dog" }.map { it.age }.average())
}

fun lambdaDestructionDeclaration() {
    val mapOf = mapOf(0 to "Lucas", 1 to "Lucca", 2 to "Luccas", 3 to "Lukas", 4 to "Luka")
    mapOf.mapValues { entry -> println("${entry.key} -> ${entry.value}!") } //Declaring the val entry of Pair<Int, String>
    println()
    mapOf.mapValues { (key, value) -> println("$key -> $value!") } //Declaring two val's key and value of Pair<Int, String>
    println()
    mapOf.mapValues { (_, value) -> println("$value!") } //Declaring only necessary val
}
