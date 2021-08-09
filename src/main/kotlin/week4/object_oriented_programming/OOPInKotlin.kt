package week4.object_oriented_programming

fun main() {
}

/**
 * 'abstract' keyword in Kotlin is the same as in Java, but we cannot override a function without explicit use 'override' keyword
 */
abstract class OOPInKotlin {

    /**
     * All default statements in kotlin are public and final (final means that can not be overridden)
     */
    public final fun defaultInKotlin() {

    }

    /**
     * If you need to mark as non final, you need to use the 'open' keyword
     */
    public open fun openInKotlin() {

    }

    /**
     * We don't have the package private as in JAVA, but we can declare 'internal' to make visible to the module
     */
    internal fun internalInKotlin() {

    }

    /**
     * And of course, we have the simple private function.
     */
    private fun privateInKotlin() {

    }
}
