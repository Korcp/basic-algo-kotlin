package codewirte

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(9)

    for (i in 0 until 9) {
        arr[i] = sc.nextInt()
    }

    val sum = arr.sum()

    for (i in 0 until 8) {
        for (j in i + 1 until 9) {
            if (sum - arr[i] - arr[j] == 100) {
                arr[i] = 0
                arr[j] = 0
                break
            }
        }
        if (arr[i] == 0) {
            break
        }
    }

    arr.sort()

    for (i in 2 until 9) {
        println(arr[i])
    }
}
