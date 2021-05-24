package week2.control_structures

fun main() {
    println(getPercentage(0))
    println(getPercentage(100))

    //In kotlin, try can be used as an expression, so the result will be assigned to the percentage value.
    val percentage = try {
        getPercentage(101)
    } catch (e: IllegalArgumentException) {
        "Error while getting the percentage value"
    }
    println(percentage)
}

/**
 * In Kotlin, there is no difference between checked and unchecked exceptions,
 * with that, you don't need to handle any exceptions, only if needed.
 * If we throw a checked exception from Kotlin and we would like to handle it in Java,
 * we need to annotate the method with @Throws({ExceptionName}::class)
 */
fun getPercentage(num: Int): Int {
    return if (num in 0..100) num else throw IllegalArgumentException("Invalid percentage value, it should be between 0 and 100: $num")
}