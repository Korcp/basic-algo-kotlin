package codewirte

import java.util.Scanner

fun main () {
    var sc=Scanner(System.`in`)
    var arr = IntArray(20)
    for(i in 0 until 20){
        arr[i]=i+1
    }
    for(i in 0 until 10){
        var a = sc.nextInt()
        var b = sc.nextInt()
        while(true){
            if(a>=b){
                break;
            }
          else {
                var temp = arr[a-1]
                arr[a-1] = arr[b-1]
                arr[b-1] = temp
                a++
                b--
            }
        }
    }
    for(i in 0 until 20){
        print("${arr[i]} ")
    }
}