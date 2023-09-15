package array

fun main() {
    val N = readln()
    val arr = IntArray(10) { 0 }

    for (i in N.indices) {
        val A = N[i].toString().toInt()
        arr[A]++
    }

    val sixNineSum = arr[6] + arr[9]
    arr[6] = (sixNineSum + 1) / 2
    arr[9] = (sixNineSum + 1) / 2

    val maxCount = arr.max()

    println(maxCount)
}
