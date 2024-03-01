import kotlin.math.sqrt

fun main() {
    try{
        var s:String? = null
        //s = "shuya"
        println("tamanho da tring é: ${s!!.length}")

        var a = 10/0
        println("o resultado da divisao é: $a")

        var b = -9.0f
        var c = sqrt(b)
            if(b<0){
                throw IllegalArgumentException()
            }

        var x = 1
            if(x==1){
                throw Exception("o valor de x nao pode ser 1")
            }

    }catch (e: NullPointerException){
        println("A variavel está vazia")
    }catch (e: ArithmeticException){
        println("nao existe divisao por 0")
    }catch (e: IllegalArgumentException){
        println("nao existe raiz real de numeros negativos")
    }catch (e: Exception){
        println("excecao mais geral: ")
        println(e.message)
    }finally {
        println("executando finally! finalizando o bloco de tratamento de dados")
    }
    println("final do programa")
}