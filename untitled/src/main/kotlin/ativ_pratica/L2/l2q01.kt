fun main() {
    println("digite o numerador: ")
    var nume = readLine()?.toInt() ?:0

    println("digite o denominador: ")
    var deno = readLine()?.toInt() ?:0

    try {
        var resp= nume/deno
        println("${nume} dividido por ${deno} é ${resp}")

    }catch (e: ArithmeticException){
        println("Não existe divisão por zero")
    }
}