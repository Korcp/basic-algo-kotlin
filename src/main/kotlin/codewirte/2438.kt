package codewirte

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var N = sc.nextInt()
    for(i in 1 .. N){
        for(j in 1..i){
            print("*")
        }
        println()
    }
}