fun main() {
    println("\nFor Loop\n")
    println("From 1 to 10")
    for (i in 1..10) {
        println("i = $i")
    }

    println("\nFrom 1 until 10")
    for (i in 1 until 10) {
        println("j = $i")
    }

    println("\nFrom 10 to 1")
    for (i in 10 downTo 1) {
        println("k = $i")
    }

    println("\nFrom 1 until 10 step 2")
    for (i in 1 ..< 10 step 2) {
        println("i = $i")
    }

    println("\n\nWhile loop\n")

    var number = 0
    while (number < 10) {
        println(number)
        number++
    }

    println("\n\nDo...while loop\n")

    // Runs the code inside the loop for the first time irrespective of condition
    number = 13

    do {
        println(number)
        number++
    } while (number < 10)

    println("\n\nbreak keyword\n")

    for (i in 1..10) {
        if (i == 7) {
            break
        }
        println("number = $i")
    }

    println("\n\ncontinue keyword\n")

    for (i in 1..10) {
        if (i == 7) {
            continue
        }
        println("number = $i")
    }

    println("\n\nNested loop\n")
    number = 0

    while (number < 5) {
        number++
        println(number)

        var i = 0

        while (i < 5) {
            i++
            println("***$i")
        }
    }


    println("\n\nLabels in loops\n")

    outer@ for (i in 1..5) {
        println(i)
        for (j in 1..5) {
            if (j == 3) {
                break@outer
            }
            println("***$j")
        }
    }
}