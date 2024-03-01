fun main() {
    var final:Int = 8
    var fibo = Array(10,{i -> i})
    fibo[0] = 1
    fibo[1] = 1
    for(i in 2 until final){
        fibo[i] = fibo[i-1] + fibo[i-2]
    }
    for(i in 0 until final){
        print("${fibo[i]} ")
    }
}