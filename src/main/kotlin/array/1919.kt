package array

fun main () {
    var s1 = readLine()!!.trim()
    var s2 = readLine()!!.trim()

    var arr1 = IntArray(26)
    var arr2 = IntArray(26)
    var cnt = 0

    for(char in s1){
        var index = char - 'a'
        arr1[index]++
    }

    for(char in s2){
        var index = char - 'a'
        arr2[index]++
    }

    for(i in 0 until 26){
        cnt += Math.abs(arr1[i]-arr2[i])
    }

    print(cnt)
}