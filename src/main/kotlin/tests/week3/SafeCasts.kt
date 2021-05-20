package tests.week3

/**
 * Safe casts
 *
 * Type cast as throws ClassCastException, if the cast is unsuccessful.
 * Safe cast as? returns null, if the cast is unsuccessful.
 * Declare the s variable to make the first line print null and the second one throw an exception.
 */
fun main(args: Array<String>) {
    val s = "Hi!"

    // Prints null because the s is a string and as is using ? to return null.
    println(s as? Int)    // null
    // Wrong cast, as will cause class cast, String cannot be casted to Int
    println(s as Int?)    // exception
}