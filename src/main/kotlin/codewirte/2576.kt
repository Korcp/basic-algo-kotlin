package codewirte

import java.util.Scanner

fun main () {
    var sc =Scanner(System.`in`)
    var arr = IntArray(7)
    var sum = 0

    for(i in 0..6){
        var n = sc.nextInt()
        if(n%2==1){
            sum=sum+n
            arr[i]=n
        }
    }
   var ca = arr.filter { it!=0 }

   if(sum==0){
       println("-1")
   }
    else {
       println(sum)
       println(ca.min())
   }
}