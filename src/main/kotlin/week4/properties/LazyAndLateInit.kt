package week4.properties

//As a lazy variable, the Hello would never be printed, only if the variable is accessed.
val lazyVariable: String by lazy {
    println("Hello from lazy!")
    "Hi lazy!"
}

//A non lazy example:
val nonLazyVariable: String = run {
    println("Hello from Non lazy!")
    "Hi non lazy!"
}

lateinit var lateinitVariable: String

fun main() {
    //If you try to use it before initialize, the you will get a runtime exception.
    //You can check if is initialized with member reference syntax.
    println(::lateinitVariable.isInitialized) // -> false
    lateinitVariable = "The late init variable can be initialized later"
    println(::lateinitVariable.isInitialized) // -> true
    println(lateinitVariable)
    println()
    println(lazyVariable)
    println(nonLazyVariable)
}
