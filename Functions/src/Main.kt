fun main() {
    sayHello()
    greeting("Test")
    // Named arguments
    add(b = 4, a = 6)
    val mulAns = mul(5, 6)
    println(mulAns)
    val subAns = sub(10, 5)
    println(subAns)

    // Anonymous function
    val div = fun(a: Int, b: Int): Any {
        return if (b == 0) "Cannot be divided by 0" else a / b
    }

    val divAns1 = div(3, 0)
    val divAns2 = div(6, 3)

    println(divAns1)
    println(divAns2)

    // Lambda function
    val mod = {a: Int, b: Int -> a % b }

    val modAns = mod(5, 4)
    println(modAns)

    val max = getMax(72837, 87, 953622, 64734, 827837, 26253)
    println(max)
}

//Function without parameter
fun sayHello() {
    println("Hello")
}

// Function with parameter
fun greeting(name: String) {
    println("Hello $name")
}

// Function with default parameter
fun add(a: Int = 3, b: Int = 5) {
    println(a + b)
}

// Function with return
fun mul(a: Int, b: Int): Int {
    return a * b
}

// Single expression function
fun sub(a: Int, b: Int) = a - b

// Variable arguments
fun getMax(vararg numbers: Int): Any {
    if (numbers.size > 0) {
        var max = numbers[0]
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }

        return max
    } else {
        return "Enter at least 1 number"
    }
}
