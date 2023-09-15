package codewirte

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    var sum = 0
    var yS = 0
    var mS = 0

    for (i in 0 until N) {
        val t = sc.nextInt()
        sum += t
        yS += (t / 30 + 1) * 10
        mS += (t / 60 + 1) * 15
    }

        if (yS < mS) {
            println("Y $yS")
        } else if (yS > mS) {
            println("M $mS")
        } else {
            println("Y M $yS")
        }
    }


