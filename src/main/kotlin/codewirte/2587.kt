package codewirte

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var arr =IntArray(5)
    var avg = 0
    for(i in 0 ..4){
        var N = sc.nextInt()
        arr[i]=N
        avg=avg+N
    }
    arr.sort()
    println(avg/5)
    println(arr[2])
}