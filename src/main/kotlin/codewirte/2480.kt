package codewirte

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var A = sc.nextInt()
    var B = sc.nextInt()
    var C = sc.nextInt()
    var d : Int =0
    when {
        A==B && B==C && A==C ->  d=10000+(A)*1000
        (A==B && A!=C) -> d=1000 +A *100
        (B==C && B!=A) -> d=1000 +B *100
        (C==A && C!=B) -> d=1000 +C *100
        (A>B && A>C) -> d= A*100
        (B>A && B>C) -> d =B*100
        (C>A && C>B) -> d = C*100
    }

    print("${d}")
}