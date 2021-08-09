package week4.object_oriented_programming.class_modifiers

//Important, "data" classes generates useful methods, 'equals', 'hashCode', 'copy', 'toString' and others automatically
//The variables used in the above methods are the variables declared on the primary constructor.
//To ignore a variable from being compared, simply add the variable to the class body.
data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Lucas", 21)
    println(person)

    val personCopy = person.copy(name = "John")
    val personCopy2 = person.copy(name = "John")
    println(person)
    println(personCopy)

    //In Kotlin to compare using equals, is simply use double equal sign '=='
    println(personCopy == personCopy2)

    //To compare reference, use three equal sign '==='
    println(personCopy === personCopy2)
}

