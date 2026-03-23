fun main() {
    // Size of an array is fixed.
    val names: Array<String> = arrayOf("Test1", "Test2", "Test3", "Test4")
    println(names[0])

    // Arrays are mutable.
    names[3] = "Test5"
    println(names[3])

    // If accessed element at the index that does not exist, it generates ArrayIndexOutOfBoundsException.
    // Below line of code generates error.
    // println(names[4])

    println("\nSize of the array is: ${names.size}\n")

    // Print all the elements of the array using loop
    for (name in names) {
        println(name)
    }

    println()

    // Print all the elements of the array using loop with index.
    // First is index, second is value.
    for ((index, name) in names.withIndex()) {
        println("names[$index] = $name")
    }

    println()

    // We can mix different types in arrays. But it's not recommended.
     val values: Array<Any> = arrayOf("Test6", 2, 6, true)

     for (value in values) {
         println(value)
     }

    // The "is" keyword in Kotlin is used for type checking.
    println("\nLoop the array with multiple types with is keyword")

    for (value in values) {
        if (value is Int) {
            println(value)
        }
    }
}