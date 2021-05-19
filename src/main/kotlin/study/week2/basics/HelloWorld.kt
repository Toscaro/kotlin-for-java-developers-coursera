package study.week2.basics

fun main(args: Array<String>) {
    val name = "Kotlin"
    println("Hello, $name!")

    //Ternary does not exists in Kotlin
    val name2 = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name2!")

    //Print null ins case of index is 0
    println("Hello, ${args.getOrNull(0)}!")

    //It call the foo() function twice, there is no cache or something like that when using with strings.
    println("First ${foo()}, second ${foo()}")
}

fun foo(): String {
    println("Calculating foo()")
    return "foo"
}