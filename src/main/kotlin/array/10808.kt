package array

fun main (){
    var arr = IntArray('z'-'a'+1) {0}
    var S = readln()

        S.forEach { arr[it-'a']++}
        arr.forEach { print("${it} ") }
}