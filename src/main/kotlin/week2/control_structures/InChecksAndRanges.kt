package week2.control_structures

fun main() {
    val c: Char = 'z'
    //Types of 'in' usage
    iteration()
    checkBelong(c)
    println(isLetter(c))
    println(isLetter('_'))
    println(isNotDigit('0'))
    println(isNotDigit('+'))
    recognize('6')
    recognize('a')
    recognize('Z')
    recognize('$')
    compareRangeOfStrings("Kotlin")
    compareRangeOfStrings("Scala")
    belongInAList("A")
    belongInAList("B")
}

/**
 * 'in' can be used to iterate over a list, map, string and so on.
 */
fun iteration() {
    for (i in 'a'..'z') {
        print(i)
    }
    println()
}

/**
 * 'in' can also be used for check if some.
 */
fun checkBelong(c: Char) {
    val boolean: Boolean = c in 'a'..'z'
    println(boolean)
}

/**
 * Belong can be used with a range, with that we can check if it is a letter or not.
 */
fun isLetter(c: Char): Boolean {
    return c in 'a'..'z' || c in 'A'..'Z'
//The same as:
//return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
}

/**
 * You can use ! to negate the result and negate a 'in' check.
 */
fun isNotDigit(c: Char): Boolean {
    return c !in '0'..'9'
}

/**
 * Range with 'in' can be used with when
 */
fun recognize(c: Char) = when (c) {
    in '0'..'9' -> println("It's a digit!")
    in 'a'..'z', in 'A'..'Z' -> println("It's a Letter")
    else -> println("I don't know...")
}

/**
 * We can also use in to check if a string is in the middle of a range from a alphabetical order
 */
fun compareRangeOfStrings(string: String) {
    println(string in "Java".."Scala")
    println(string in setOf("Java", "Scala"))
}

/**
 * For any object that implements comparable whe can use in to compare one to another.
 */
fun compareDates() {
//    dateObject
//    if (dateObject in startDate..endDate){
//        //...
//    }
}

/**
 * Check if a object belongs to a list.
 */
fun belongInAList(string: String) {
    val list = setOf("A", "D")
    println(string in list)
}