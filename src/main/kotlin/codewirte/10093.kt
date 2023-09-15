package codewirte

fun main() {
    val input = readLine()!!.split(" ")
    val A = input[0].toLong()
    val B = input[1].toLong()

    val cnt = if (A == B) 0 else if (A < B) B - A - 1 else A - B - 1

    println(cnt)
    if (cnt > 0) {
        val start = minOf(A, B) + 1
        val end = maxOf(A, B) - 1
        for (i in start..end) {
            print("$i ")
        }
    }
}
