package array

fun main () {
    var (N,K) = readLine()!!.split(" ").map { it.toInt()}
    var arr =Array(2) {IntArray(7){0}}
    var count =0
    for(i in 0 until N){
        var (S,Y)= readLine()!!.split(" ").map{it.toInt()}
        arr[S][Y]++
    }

    for (i in 0 until 2){
        for(j in 0 until 7){
            count += (arr[i][j]+K-1) /K
        }
    }
    print(count)
}