fun main() {
    try {
        var notas: Array<Double> = Array(6) { 0.0 }
        for (i in 0 until notas.size) {
            var cont = 0
            do {
                if (cont > 0) {
                    println("As notas nao podem ser maiores que 10 ou menores que 0")
                }
                println("Digite a ${i + 1}° nota:  ")
                notas[i] = readLine()?.toDouble() ?: 0.0
                cont++
            } while (notas[i] < 0 || notas[i] > 10)
        }

        var soma = 0.0
        for (i in 0 until notas.size) {
            soma += notas[i]
        }
        println("A média das notas é igual a: ${"%.2f".format(soma / 6)}")
    }catch (e: NumberFormatException){
        println("DIGITE A NOTA!")
    }
}