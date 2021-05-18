package basics

fun main() {
    //Named and default arguments, joinToString has a default value for some parameters,
    //you can choose which one you would like to change it's value and pass it as a parameter.
    println(listOf("a", "b", "c").joinToString(separator = "", prefix = "(", postfix = ")"))

    //In that case, the default implemented value for separator and prefix will be used.
    println(listOf("a", "b", "c").joinToString(postfix = "."))
    displaySeparator()
    displaySeparator(size = 5)
    displaySeparator(character = '#')
}

/**
 * To this function be able to be called in java using default values we should use the @JvmOverloads annotation
 */
fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
    println()
}