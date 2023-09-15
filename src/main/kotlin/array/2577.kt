package array

fun main () {
    var A = readln().toInt()
    var B = readln().toInt()
    var C = readln().toInt()
    var arr = IntArray(10) {0}
    var cal = (A*B*C).toString()
    for(i in 0 until cal.length){
        var tmp = cal[i].digitToInt()
        when(tmp){
            0 -> arr[0]++
            1 -> arr[1]++
            2 -> arr[2]++
            3 -> arr[3]++
            4 -> arr[4]++
            5 -> arr[5]++
            6 -> arr[6]++
            7 -> arr[7]++
            8 -> arr[8]++
            9 -> arr[9]++
        }

        }
    for(j in 0 until arr.size){
        println(arr[j])
    }
}