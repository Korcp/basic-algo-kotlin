package array

fun main () {
    var N = readLine()!!.toInt()
    var arr = readLine()!!.split(" ").map { it.toInt() }
    var v = readLine()!!.toInt()
    var cnt = 0

    for (i in 0 until N){
        if(arr[i]==v){
            cnt++
        }
    }
    print(cnt)
}