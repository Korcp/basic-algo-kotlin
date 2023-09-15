package codewirte

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var a =sc.nextInt()
    var b =sc.nextInt()
    var c =sc.nextInt()

    var arr = arrayOf(a,b,c)

    arr.sort()

    for(i in 0 ..2){
        print("${arr[i]} ")
    }

}