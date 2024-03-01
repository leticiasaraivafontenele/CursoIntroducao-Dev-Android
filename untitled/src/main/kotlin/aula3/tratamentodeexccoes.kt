import java.lang.ArithmeticException
import kotlin.IllegalArgumentException
import kotlin.math.sqrt

fun main() {
    val num = 10
    val dem = 1

    try{
        val res = num/dem
        println("o resultado é: ${res}")

    }catch (e: ArithmeticException){
        println("erro: nao existe divisao pro 0")
    }

    val nume = -4.0f
    try{
        val resp2 = sqrt(nume)
        if(nume< 0){
            throw IllegalArgumentException()
        }
        println("resultado da radiciacao é: ${resp2}")
    }catch (e: IllegalArgumentException){
        println("nao existe raiz real de numeros negativos")
    }
}