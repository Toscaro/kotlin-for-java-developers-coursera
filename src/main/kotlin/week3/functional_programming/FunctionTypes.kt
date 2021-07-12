package week3.functional_programming

fun main() {
    storingALambdaInVariable()
    passingALambdaAsParameter()
    postponedTestRunnable(100) { println("Hi!") }
    functionWithNullableValueOrFun()
}

fun storingALambdaInVariable() {
    //Storing a lambda on subtraction without explicit declaring the lambda type
    val subtraction = { x: Int, y: Int -> x - y }
    //Storing a lambda on subtractionV2 declaring the lambda type
    val subtractionV2: (Int, Int) -> Int = { x, y -> x - y }

    println(subtraction(2, 1))
    println(subtractionV2(2, 1))
}

fun passingALambdaAsParameter() {
    val isEven = { i: Int -> i % 2 == 0 }
    val listOf = listOf(0, 1, 2, 3)
    println(listOf.any(isEven))
    println(listOf.filter(isEven))
}

fun postponedTestRunnable(delay: Int, runnable: Runnable) {
    println(delay)
    runnable.run()
}

fun functionWithNullableValueOrFun() {
//    val function1: () -> Int? = null // Don't compile, it's not possible to assign a null value to a non nullable function.
    val function2: () -> Int? = { null }
    val function3: (() -> Int)? = null
//    val function4: (() -> Int)? = { null } // Don't compile, it's not possible to assign a null value to a non Int value.

    if (function3 != null) {
        //After checking if the function is not null, the function is smart casted to a non nullable fun.
        function3()
    }

    //We can also simply use ?.invoke to call a function if is not null
    function3?.invoke()
}
