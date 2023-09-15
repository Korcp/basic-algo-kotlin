package codewirte

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)

    for(i in 0 .. 2){
        var a =sc.nextInt()
        var b =sc.nextInt()
        var c =sc.nextInt()
        var d =sc.nextInt()

        when{
            (a+b+c+d)==0 ->println("D")
            (a+b+c+d)==1 ->println("C")
            (a+b+c+d)==2 ->println("B")
            (a+b+c+d)==3 ->println("A")
            (a+b+c+d)==4 ->println("E")

        }
    }
}