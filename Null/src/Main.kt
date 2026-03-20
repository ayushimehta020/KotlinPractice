fun main() {
    // By putting ? in front of data type, we can assign null to it.
    // By default, all the data types are non-nullable

    var text: String? = "Name"
    // text = null

    if (text != null) {
        println(text.length)
    } else {
        println("The variable is null.")
    }

    // ?. is called safe call operator. It checks if a variable holds a null value. It prevents your code from getting NullExceptionPointer.
    // Below print statement checks if the text variable is null or not. If it is null, it prints null. Otherwise, it prints the length.
    println(text?.length)

    // !!. is called not-null assertion operator. It converts nullable types to non-nullable and if the value is null, it throws NullPointerException.
    // Below print statement will throw NullPointerException if text is null. Otherwise, prints the length.
    println(text!!.length)

    // ?: is called Elvis operator. It checks if the value in left is null. If it is, then it assigns whatever value is on the right-hand side of the operator.
    // TL;DR It provides default value for the value assigned to the variable.
    val text2: String = text ?: "Some text"

    // If text is null, prints "Some text", otherwise prints the value of text.
    println(text2)
}