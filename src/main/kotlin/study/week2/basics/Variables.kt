package study.week2.basics

fun main() {
    //It is possible to reassign a val variable type.
    var mutableVariable = 10
    println(mutableVariable)
    mutableVariable = 5
    println(mutableVariable)

    //readOnlyVariable = "Hi!"
    //Impossible to reassign a val variable type, because val is a read-only variable.
    val readOnlyVariable = "Hello!"
    println(readOnlyVariable)

    //Also, it's not possible to change the type of var type, it will cause a Compilation error
    //mutableVariable = "Test!"
}