package week3.functional_programming

import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction2

fun main() {
    val listOfInts: List<Int> = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 5)
    val listOfAnimals: List<Animal> = listOf(Animal("Ayla", 10), Animal("Rex", 1), Animal("Dark", 3), Animal("Cat", 3))

    memberReferenceUsage(listOfAnimals)
    storeLambdaOrFunction()
    passFunAsAnArgument(listOfInts)
    boundAndNonBoundReference(listOfAnimals)
}

fun memberReferenceUsage(listOfAnimals: List<Animal>) {
    //Simply get the animal with the higher age.
    println(listOfAnimals.maxOf { it.age })

    //The same as above, but using member references.
    println(listOfAnimals.maxOf(Animal::age))
}

fun storeLambdaOrFunction() {
    //In kotlin we can store a lambda in a variable
    val isEven: (Int) -> Boolean = { number: Int -> number % 2 == 0 }

    //But we can not store a method in a variable.
    // val storeAFun = isEvenFun

    // To use this function we can store the reference of the function.
    val storeAFun: KFunction1<Int, Boolean> = ::isEvenFun
}


fun isEvenFun(number: Int): Boolean = number % 2 == 0

fun passFunAsAnArgument(listOfInts: List<Int>) {
    //We can use the function reference with :: to pass the function as a argument.
    println(listOfInts.any(::isEvenFun))

    println(listOfInts.filter(::isEvenFun))
}

fun boundAndNonBoundReference(listOfAnimals: List<Animal>) {
    //No bound reference, means, any animal can be used on the current reference to isOlder,
    val nonBoundAgePredicate: KFunction2<Animal, Int, Boolean> = Animal::isOlder

    //but we need to pass the object as a argument
    println(nonBoundAgePredicate(listOfAnimals[0], 2))

    //Bound reference, means, I created a reference to the referenced object.
    val boundAgePredicate: KFunction1<Int, Boolean> = listOfAnimals[0]::isOlder

    //with the bound, we don't need to pass the object reference when using the function.
    println(boundAgePredicate(2))

    //We can bound to "this" reference (check the isOlderPredicate omitting 'this' before '::' ):
    val isOlderPredicate: KFunction1<Int, Boolean> = listOfAnimals[0].getIsOlderPredicate()
    println(isOlderPredicate(2))
}