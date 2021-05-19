package study.week2.control_structures

enum class Color {
    BLUE,
    ORANGE,
    RED,
    YELLOW,
    VIOLET,
    GREEN,
    INDIGO
}

fun main() {
    //If is an expression, there is no ternary expression like in java.
    val a = 1
    val b = 2
    val max: Int = if (a > b) a else b

    println(getDescription(Color.RED))
    println(respondToInput("no"))
    println(mix(Color.BLUE, Color.YELLOW))
    println(updateWeather(4))
}

/**
 * When in Kotlin work like a Java switch.
 */
fun getDescription(color: Color): String {
    return when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
        else -> ""
    }
}

/**
 * You can list some values to compare based on @param input
 * They are separated by comma, so if the input is y or yes, the return will be:
 * "I'm glad you agree"
 */
fun respondToInput(input: String) = when (input) {
    "y", "yes" -> "I'm glad you agree"
    "n", "no" -> "Sorry to hear that"
    else -> "I don't understand you"
}

/**
 * Also we can create a setOf colors and compare with other sets of colors.
 */
fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty color")
}

/**
 * In Kotlin we can use 'is' to check if the pet is a Cat or a Dog, like 'instanceof' in Java.
 * Kotlin apply a 'smartcast' after using 'is', so after checked we can call any methods from cat, or dog.
 * It's not necessary to cast again like in Java:
 * ((Cat) pet).meow()
 */
//fun talk(pet: Pet) = when (pet) {
//    is Cat -> pet.meow()
//    is Dog -> pet.woof()
//}


/**
 * No argument when.
 * We can use any boolean expression to check on it.
 * If is satisfied we simply execute the corresponding expression.
 */
fun updateWeather(degrees: Int):Pair<String, Color> {
    val (description, colour) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }
    return Pair(description, colour)
}