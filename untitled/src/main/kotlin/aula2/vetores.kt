package aula2

fun vetor_int(){
    var numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    for(i in 0 .. (numeros.size-1)){
        print("${numeros[i]}")
    }
    print("\n")
}
fun vetor_int2(){
    var n = Array(10,{i -> i})
    for(i in n){
        print("${n[i]}")
    }
    print("\n")
}

fun main() {
    vetor_int()
    vetor_int2()

}