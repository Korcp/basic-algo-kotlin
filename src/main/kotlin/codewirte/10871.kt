package codewirte

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var N = sc.nextInt()
    var X = sc.nextInt()

    for(i in 0 until N){
        var A =sc.nextInt()

        if(A<X){
            print("${A} ")
        }
    }
}