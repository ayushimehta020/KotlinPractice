// Program to find and count even numbers between an arbitrary range of numbers and print them.

fun main() {
    val start = 1
    val end = 100
    var evenCount = 0

    for (i in start..end) {
        if (i % 2 == 0) {
            evenCount++
            println(i)
        }
    }

    println("There are total $evenCount even numbers between $start (including) and $end (including)")
}