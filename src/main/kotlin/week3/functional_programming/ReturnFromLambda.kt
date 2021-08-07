package week3.functional_programming


fun main() {
    val listOfInts: List<Int> = listOf(5, 7, 8, 0, 1, 2, 0)
    println(returnFromFun(listOfInts))
    println(returnFromFlatMap(listOfInts))
    println(returnFromLabeledFlatMap(listOfInts))
    println(returnFromLocalFun(listOfInts))
    println(returnFromAnonymousFunction(listOfInts))
    println(notReturnFromFun(listOfInts))
}

//All 'returns' return from the holy function marked with 'fun'
//So if there is any zero on the received list, the returned value from the function will be a empty list.
fun returnFromFun(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return listOf()
        listOf(it, it)
    }
}

//Return's with label 'return@label' will return only to the specific label.
fun returnFromFlatMap(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return@flatMap listOf()
        listOf(it, it)
    }
}

//You can also define a specific label name and works in the same way.
fun returnFromLabeledFlatMap(list: List<Int>): List<Int> {
    return list.flatMap test@{
        if (it == 0) return@test listOf()
        listOf(it, it)
    }
}

//As the return, returns from the last fun, we can create a local function:
fun returnFromLocalFun(list: List<Int>): List<Int> {
    fun localFun(int: Int): List<Int> {
        if (int == 0) return listOf()
        return listOf(int, int)
    }
    return list.flatMap(::localFun)
}

//Also we can use anonymous function:
fun returnFromAnonymousFunction(list: List<Int>): List<Int> {
    return list.flatMap(fun(number): List<Int> {
        if (number == 0) return listOf()
        return listOf(number, number)
    })
}

//A simply way on this solution is not use a return inside the lambda :D
fun notReturnFromFun(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) {
            listOf()
        } else {
            listOf(it, it)
        }
    }
}