package study.week3.nullability

fun main() {
    //We cannot assign a null value to this variable.
    var nonNull = "never null"
//    nonNull = null
    println(nonNull)

    //If necessary we can create a variable like this:
    //We need to add a ? (question mark) after the variable type.
    var nullable: String? = null
    println(nullable)
    nullable = "may be null"
    println(nullable)

    //When accessing a length from a String, if declared normally, the code compiles fine,
    //but if is marked as a nullable with ? the code not compile.
    nonNull.length
//    nullable.length (error during compile time)

    //In to be able to use a null variable we have to use a if check.
    if (nullable != null) {
        nullable.length
    }

    //In other hand, kotlin added a safe access, we can call it using the following code:
    //The result will be null if the nullable variable has no value, instead of cause a NPE (NullPointerException)
    nullable?.length

    //To be able to assign to a nonNull variable from a nullable variable,
    //we need to provide a default value for the result
    val length: Any = nullable?.length ?: 0
    println("with default: $length")

    val lengthNull: Int? = nullable?.length
    println("without default: $lengthNull")

    assertionNPE()
    elvisOperator()
}

/**
 * After checking in a if() if a variable is null, we don't need to check it again:
 * (can also use string!! to get the value or cause a NPE if is null)
 */
fun assertionNPE() {
    var string: String? = "a"
    println(string!!) //!! cause a NPE if string is null.

    //Without ? or !!,
    //Note, the usage of (!!) (assertion) is only recommended in some cases.
    //Prefer the if(), ?: and ?. checks.
    println(string.length)
    //println(string(?).length)
}

/**
 * Working with parenthesis on Elvis ?:
 */
fun elvisOperator() {
    var x: Int? = 1
    val y = 2
    val s1 = x ?: 0 + y //0 + y is executed first
    val s2 = x ?: (0 + y) //(0 + y) is executed first (use the parenthesis to help legibility)
    val s3 = (x ?: 0) + y //x ?: 0 is executed first

    println("s1= $s1")
    println("s2= $s2")
    println("s3= $s3")

}