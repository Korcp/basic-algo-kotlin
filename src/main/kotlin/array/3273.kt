package array


fun main () {
    var n = readLine()!!.toInt()
    var arr = readLine()!!.split(" ").map({it.toInt()}).sorted().toIntArray()
    var x = readLine()!!.toInt()

    var left =0
    var right = n-1
    var cnt =0

    while(left<right){
        val sum = arr[left]+arr[right]

        when {
            sum ==x -> {
                cnt++
                left++
                right--
            }
            sum < x -> {
                left++
            }
            else -> {
                right--
            }
        }

    }
    print(cnt)
}