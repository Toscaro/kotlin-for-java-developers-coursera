package week4.properties

fun main() {
    val bar = Properties()
    bar.foo = 5
    bar.properties()
    bar.field()
}

class Properties {
    val readOnlyFoo = 0
    var foo = 0

    val isReadFooEqualFoo: Boolean
        get() = readOnlyFoo == foo

    //On this case the fooBar has it's value stored and the print method is called once.
    val fooBar = run {
        println("Printing fooBar")
        50
    }

    //As a custom get, it's called on each access.
    val fooBarTest: Int
        get() {
            println("Printing fooBarTest")
            return 51
        }


    fun properties() {
        //Not possible to assign a new value to a 'val' type
        //readOnlyFoo = 0
        println(readOnlyFoo)

        //Vay value is mutable, so we can change it's value.
        //Different than JAVA, we don't need to call getters and setters.
        //To use the variable is simply call it, but to set a new value to it, is just use equal sign '=' after it call.
        foo = 2
        println(foo)

        //We can create a variable that implements a custom get
        println(isReadFooEqualFoo)

        println("$fooBar $fooBar")

        println("$fooBarTest $fooBarTest")
    }

    var fieldUsage: Boolean = false
        set(value) {
            println("field has changed $field -> $value")
            field = value
        }

    //No backing field
    var state: String
        get() = if (fieldUsage) "TRUE" else "FALSE"
        set(value) {
            fieldUsage = value == "TRUE"
        }

    //If you don't declare any get and/or setter, the compiler will generate automatically this default.
    var defaultGetAndSetter: String = "Wow!"
        get() = field
        set(value: String) {
            field = value
        }

    //Change a visibility, private set, means that the only this class can access the set of this property,
    //but any class can get the value of it.
    var testingVisibility: String = "Test"
        private set

    fun field() {
        println("Field usage:")
        println(fieldUsage)
        fieldUsage = true
        fieldUsage = false

        println(state)
        state = "TRUE"
        println(state)

        //In kotlin, you would never call the get and setters, just the property
        //But under the hood, the getters and setters are called.
        println(defaultGetAndSetter)
        defaultGetAndSetter = "test"
        println(defaultGetAndSetter)
    }
}