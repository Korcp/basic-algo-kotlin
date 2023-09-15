package codewirte

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)

    var year = sc.nextInt()


        if((year%4==0) and ((year%100!=0) or (year%400==0))){
            print("1")
        }
        else print("0")

}