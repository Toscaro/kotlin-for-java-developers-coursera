package week2.control_structures

fun main() {
    whileAndDoWhile()

    val list = listOf("a", "b", "c")
    iterateThroughAList(list)
    iterateAMap()
    iterateWithIndex(list)
    iterateWithRange()
    iterateWithRangeUntil()
    iterateDESCWithStep()
    iterateOverAString()
}

fun whileAndDoWhile() {
    val boolean = false
    while (boolean) {
        //Do nothing
    }

    do {
        //Do nothing
    } while (boolean)
}

/**
 * Simple iteration in a List like foreach in Java.
 */
fun iterateThroughAList(list: List<String>) {
    for (s in list) {
        print(s)
    }
    println()
}

/**
 * Iterate a map using it key and value.
 */
fun iterateAMap() {
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    for ((key, value) in map) {
        println("$key = $value")
    }
}

/**
 * Iterate a list with index.
 */
fun iterateWithIndex(list: List<String>) {
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
    println()
}

/**
 * Iterate with range
 */
fun iterateWithRange() {
    for (i in 1..10) {
        print(i)
    }
    println()
}

/**
 * Iterate with range without the last number
 */
fun iterateWithRangeUntil() {
    for (i in 1 until 10) {
        print(i)
    }
    println()
}

/**
 * Iterate descending with step.
 * It jumps each position based on steps
 * downTo mean we go from 9 to 1, using a DESC order.
 */
fun iterateDESCWithStep() {
    for (i in 9 downTo 1 step 2) {
        print(i)
    }
    println()
}

fun iterateOverAString() {
    for (c in "abc") {
        print(c + 1)
    }
    println()
}