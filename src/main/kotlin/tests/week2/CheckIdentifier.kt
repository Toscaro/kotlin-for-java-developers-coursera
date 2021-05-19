package tests.week2

/**
 * Implement the function that checks whether a string is a valid identifier.
 * A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters,
 * digits and underscores.
 */
fun isValidIdentifier(s: String): Boolean {
    return s.isNotEmpty() && startsWithValidChar(s[0]) && notContainAInvalidChar(s)
}

fun startsWithValidChar(c: Char): Boolean {
    return (c.isLetter() || c in "_")
}

fun notContainAInvalidChar(string: String): Boolean {
    for (c: Char in string) {
        if (c !in "_" && !c.isLetterOrDigit()) {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}