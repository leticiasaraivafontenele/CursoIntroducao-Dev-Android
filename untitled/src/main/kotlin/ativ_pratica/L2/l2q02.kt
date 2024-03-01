import kotlin.math.sqrt

fun main() {
    println("Digite o 'a': ")
    val a = readLine()?.toInt() ?:0
    println("Digite o 'b': ")
    val b = readLine()?.toInt() ?:0
    println("Digite o 'c': ")
    val c = readLine()?.toInt() ?:0

    try {
        val del= (b * b) - (4 * a * c)
        if(del < 0){
            throw IllegalArgumentException()
        }

        if(del == 0){
            println("A equação só tem uma solução que é: ${(-b)/(2*a)}")
        }else{
            println("As duas raizes da equação são: ${(-b + sqrt(del.toFloat()))/(2*a)} e ${(-b - sqrt(del.toFloat()))/(2*a)}")
        }

    }catch (e: IllegalArgumentException){
        println("O delta é menor que 0 logo não existem raizes reais")
    }
}