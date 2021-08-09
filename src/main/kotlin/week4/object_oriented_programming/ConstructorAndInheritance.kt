package week4.object_oriented_programming

fun main() {
    //To call the default constructor is simply call as a regular function with curly braces, without new keyword.
    ConstructorAndInheritance()

    ConstructorAndInheritance2()

    //Calling the primary constructor
    ConstructorAndInheritance3("Hi!", 22)
    ConstructorAndInheritance4(24)
    println("Overriding property:")
    Child()
}

class ConstructorAndInheritance {
}

//You can add a visibility to the constructor adding the 'constructor' keyword
class ConstructorAndInheritance2 internal constructor() {
}

open class ConstructorAndInheritance3(val test: String, val number: Int) {

    //Secondary constructor should always call another secondary or the primary constructor.
    constructor(number: Int) : this("Wow!", number)

    //Init works as the constructor body.
    init {
        println(test)
        println(number)
    }
}

interface ConstructorAndInheritanceInterface {
    val wowString: String
}

//The parenthesis diff if we are extending or implementing a class in Kotlin.
class ConstructorAndInheritance4(int: Int) : ConstructorAndInheritance3(int), ConstructorAndInheritanceInterface {
    override val wowString: String
        get() = "test!"

    //We can use super keyword to call the super constructor.
//    constructor(int:Int) : super(int)
}

abstract class ConstructorAndInheritance5 : ConstructorAndInheritanceInterface


//Overriding a property can cause some issues if used on parent constructor:
open class Parent {
    open val foo = 1

    init {
        println(foo)
    }
}

class Child : Parent() {
    override val foo = 2
}