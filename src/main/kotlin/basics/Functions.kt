package basics

/**
 * Expression body in kotlin
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxInLine(a: Int, b: Int): Int = if (a > b) a else b

/**
 * Unit is like void Type in Java, it's not necessary in functions with non return type.
 */
fun displayMax(a: Int, b: Int) {
    println(max(a, b))
}

fun displayMaxUnit(a: Int, b: Int): Unit {
    println(max(a, b))
}

//Types of functions:

/**
 * Top Level Function, does not require a class, it's a static function by default.
 * To be used in Java, you should call the class name .function(), like:
 * FunctionsClass.topLevelFunction()...
 * Also you can define a annotation before the package name JVM name to use instead of the class name:
 * @file:JvmName("Util")
 * So the call would be:
 * Util.topLevelFunction()...
 */
fun topLevelFunction() {
}

class FunctionsClass {
    /**
     * Member function is a function inside a class.
     */
    fun memberFunction() {
    }

    fun other() {
        /**
         * Local Functions, functions can also be declared inside another function
         */
        fun local() {

        }
    }
}