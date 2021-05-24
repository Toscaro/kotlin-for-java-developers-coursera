package week3.nullability

fun main() {
    var any: Any = "Any Type!"

    //(is) is a instance of check.
    if (any is String) {
        //(as) is a typecast.
        val string: String = any as String
        string.toUpperCase()
    }

    if (any is String) {
        //SmartCast after check with is
        any.toUpperCase()
    }

    (any as String).toUpperCase() //(as) will cause a cast exception if is not a string

    (any as? String)?.toUpperCase() //(as?) will return a null.

    //The same logic:
    val s1 = if (any is String) any else null
    val s2: String? = any as? String
}