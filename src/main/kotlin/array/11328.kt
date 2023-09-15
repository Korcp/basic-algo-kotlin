package array

fun main () {
    var N = readLine()!!.toInt()
    for(i in 0 until N){
        val input = readLine()!!.trim().split(" ")
        val t1 = input[0]
        val t2 = input[1]

        if (t1.toCharArray().sorted() == t2.toCharArray().sorted()) {
            println("Possible")
        } else {
            println("Impossible")
        }
    }
}