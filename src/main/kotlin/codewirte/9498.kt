package codewirte

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)

    var grade = sc.nextInt()

    var score =when(grade) {
        in 90 .. 100 -> "A"
        in 80 until 90 -> "B"
        in 70 until 80 -> "C"
        in 60 until 70 -> "D"
        else -> "F"
    }
    print(score)
}