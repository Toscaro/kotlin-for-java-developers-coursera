package week4.object_oriented_programming.class_modifiers

enum class Color {
    RED, GREEN, BLUE
}

enum class ColorWithProperties(val red: Int = 0, val green: Int = 0, val blue: Int = 0) {
    RED(red = 255), GREEN(green = 255), BLUE(blue = 255)
}

fun getColorString(color: Color) = when (color) {
    Color.RED -> "Red"
    Color.GREEN -> "Green"
    Color.BLUE -> "Blue"
}

fun main() {
    println(getColorString(Color.RED))
    println(getColorString(Color.GREEN))
    println(getColorString(Color.BLUE))

    println()

    println(ColorWithProperties.RED)
    println(ColorWithProperties.GREEN)
    println(ColorWithProperties.BLUE)

    println()

    println(ColorWithProperties.BLUE.red)
    println(ColorWithProperties.BLUE.green)
    println(ColorWithProperties.BLUE.blue)
}
