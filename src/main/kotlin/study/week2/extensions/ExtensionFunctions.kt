package study.week2.extensions

fun String.lastChar() = get(length - 1)

fun String.firstChar() = get(0)

fun String.repeat(int: Int): String {
    val sb = StringBuilder(int * length)
    for (i in 1..int) {
        sb.append(this)
    }
    return sb.toString()
}

fun main() {
    val s: String = "abcd"
    println(s.lastChar())
    println(s.firstChar())
    println(s.repeat(2))

    //To be able to call a function from java, we should call the class and function with parameter like:
    //ExtensionFunctions.lastChar("string")
    //Also, if the function has a parameter, in Java we should pass two parameters, first, the type, and second, the param.
    //ExtensionFunctions.repeat("string", int)
}