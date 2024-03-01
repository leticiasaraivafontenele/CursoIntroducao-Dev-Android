import kotlin.math.sqrt

fun main() {
    try {
        println("Digite um número: ")
        val num = readLine()?.toDouble() ?: 0.0

        if(num <= 0){
            throw IllegalArgumentException()
        }

        println("a raiz de ${num} é: ${sqrt(num)}")

    }catch (e: IllegalArgumentException ){
        println("Não existe raiz real de numeros negativos")
    }
}