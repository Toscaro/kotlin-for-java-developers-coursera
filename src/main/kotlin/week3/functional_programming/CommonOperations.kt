package week3.functional_programming

fun main() {
    val listOfInts: List<Int> = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 5)
    val listOfAnimals: List<Animal> = listOf(Animal("Ayla", 10), Animal("Rex", 1), Animal("Dark", 3), Animal("Cat", 3))
    filter(listOfInts)
    map(listOfInts)
    checks(listOfInts)
    finders(listOfInts)
    count(listOfInts)
    partition(listOfInts)
    group(listOfAnimals)
    zip(listOfInts, listOfAnimals)
    flatten()
}

fun filter(listOfInts: List<Int>) {
    println("filter -> ")
    val isEven = { number: Int -> number % 2 == 0 }
    println(listOfInts.filter(isEven).toList()) //Checking if is Even
    println(listOfInts.filterNot(isEven).toList()) //Checking if is not Even (Odd)
}

fun map(listOfInts: List<Int>) {
    println("map -> ")
    println(listOfInts.map { it + 1 }) //Adding one for each element.
    println(listOfInts.map { it * it }) //Multiplying the each element to it self.
}

fun checks(listOfInts: List<Int>) {
    println("checks -> ")
    println(listOfInts.any { it == 4 })
    println(listOfInts.none { it == 4 })
    println(listOfInts.all { it == 4 })
}

fun finders(listOfInts: List<Int>) {
    println("find -> ")
    // Search for the first element which satisfies the condition and return it.
    println(listOfInts.find { it - 6 == 3 })
    //For no elements, find returns null.
    println(listOfInts.find { it == 11 })

    println("first -> ")
    //Find the first element based on condition, if none is found, return an exception.
    println(listOfInts.first { it == 0 })
    //Find the first element based on condition, if none is found, return null.
    println(listOfInts.firstOrNull { it == 11 })
}

fun count(listOfInts: List<Int>) {
    println("count -> ")
    //Return the quantity of the objects which satisfies the condition.
    println(listOfInts.count { it == 0 })
}

fun partition(listOfInts: List<Int>) {
    println("partition -> ")
    val isEven = { number: Int -> number % 2 == 0 }
    //Partition will create two lists, the first is from the elements which satisfies the condition, and the second all
    //other remaining objects.
    val (listWithEven, listWithOdd) = listOfInts.partition(isEven)
    println(listWithEven)
    println(listWithOdd)
}

fun group(listOfAnimals: List<Animal>) {
    println("groupBy -> ")
    //Group is more used when the key (in case age) is not unique,
    //that's why it generate a int key (age) of a List of animals.
    val groupOfAnimalsByAge: Map<Int, List<Animal>> = listOfAnimals.groupBy { it.age }
    println(groupOfAnimalsByAge)

    println("associateBy -> ")
    //In other hand, we can use associateBy when the key is unique, to have a key (name) that references a single animal.
    val associateByName = listOfAnimals.associateBy { it.name }
    println(associateByName)

    //If use associateBy with a non unique key, the last element with that key will be select and all others deleted.
    val associateByAge = listOfAnimals.associateBy { it.age }
    println(associateByAge)

    //associate creates a map of a list but also removes duplicated objects based on Key (k).
    val associate: Map<Int, String> = listOfAnimals.associate { it.age to it.name }
    println(associate)
}

fun zip(listOfInts: List<Int>, listOfAnimals: List<Animal>) {
    println("zip -> ")
    //Normal zips, zip the first element with the first element on the other list,
    //the result will be a a list of pairs based on the items positions.
    val zipIntsWithAnimals: List<Pair<Int, Animal>> = listOfInts.zip(listOfAnimals)
    println(zipIntsWithAnimals)

    val zipAnimalsWithInts: List<Pair<Animal, Int>> = listOfAnimals.zip(listOfInts)
    println(zipAnimalsWithInts)

    println("zipWithNext -> ")
    //ZipWithNext with the base logic
    val zipIntsWithNext: List<Pair<Int, Int>> = listOfInts.zipWithNext()
    println(zipIntsWithNext)

    //You can zip with a custom lambda
    val zipIntsWithCustomNext: List<Pair<Int, Int>> = listOfInts.zipWithNext { a, b -> a to b + 1 }
    println(zipIntsWithCustomNext)
}

fun flatten() {
    println("flatten -> ")
    //Flatten will create a unique list from a list of lists with all elements.
    val listOfLists: List<List<Int>> = listOf(listOf(0, 1, 2, 3), listOf(4, 5, 6, 7, 8, 9), listOf(10, 11, 12, 13, 14))
    println(listOfLists)

    val flatten: List<Int> = listOfLists.flatten()
    println(flatten)

    println("flatMap -> ")
    val listOfStrings = listOf("ab", "cde", "fgh", "i")
    val flatMap = listOfStrings.flatMap { it.toList() }
    println(flatMap)
}