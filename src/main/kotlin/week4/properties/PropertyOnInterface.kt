package week4.properties

import week3.functional_programming.Animal

interface PropertyOnInterface {
    //We can define properties on a interface, and it would work as a get on the class implementing it.
    val property: Animal
    val property2: Animal
}

val String.lastIndex: Int
    get() = this.length - 1

val String.indices: IntRange
    get() = 0..lastIndex

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

class PropertyClass : PropertyOnInterface {
    override val property: Animal = Animal("Ayla", 2)
    override val property2: Animal
        get() = Animal("Ayla", 2)

    fun usingExtensionProperties() {
        println("wow".lastIndex)
        println("wow".indices)

        val stringBuilder = StringBuilder("Test!!")
        println(stringBuilder)
        stringBuilder.lastChar = '?'
        println(stringBuilder)
    }
}

fun main() {
    PropertyClass().usingExtensionProperties()
}

