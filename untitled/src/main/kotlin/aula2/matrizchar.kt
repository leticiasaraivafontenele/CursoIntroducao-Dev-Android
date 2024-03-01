package aula2

fun main() {
    val linhas = 3
    val colunas = 3
        val matriz: Array<Array<Char>> = Array(linhas){Array(colunas) {' '}}
    var c:Char = 'a'

    for(i in 0 until linhas){
        for(j in 0 until colunas){
            matriz[i][j] = c++
        }
    }
    for(i in 0 until linhas){
        for(j in 0 until colunas){
            print("${matriz[i][j]} ")
        }
        println()
    }
}