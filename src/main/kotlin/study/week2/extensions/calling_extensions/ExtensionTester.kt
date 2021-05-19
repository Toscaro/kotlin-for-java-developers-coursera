package study.week2.extensions.calling_extensions

fun Animal.foo() = "static ???"
fun Dog.foo() = "static woof!"

//foo is a function declared on Cat, so this foo will be never called.
fun Cat.foo() = "static meow!"

/**
 * foo () is a static method "added" on the receiver class.
 * As static, is not possible to inherit it from parent,
 * so we aren't able to use the foo () from Cat when having a variable type of Animal,
 * even if the real object in heap is a cat, we need to cast it to Cat before be able to call foo().
 */
fun main() {
    val list = setOf(Dog(), Cat(), Animal())
    for (animal in list) {
        println(animal.foo())
    }

    println("With casting:")

    for (animal in list) println(
        when (animal) {
            is Cat -> animal.foo()
            is Dog -> animal.foo()
            else -> animal.foo()
        }
    )
}