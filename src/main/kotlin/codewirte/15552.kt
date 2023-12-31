package codewirte

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main () {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.`out`))
    repeat(br.readLine().toInt()){
        val token = StringTokenizer(br.readLine())
        val sum = (token.nextToken().toInt() + token.nextToken().toInt()).toString()
        bw.write(sum + "\n")
    }
    bw.flush()
    bw.close()
}