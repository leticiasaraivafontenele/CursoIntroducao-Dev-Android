fun main() {
    val linhas: Int = 4
    val colunas: Int = 4
        val matriz: Array<Array<Float>> = Array(linhas) {Array(colunas) {0.0f}}

    var digito:Float = -1.0f

    for(i in 0 until linhas){
        for(j in 0 until colunas){
            matriz[i][j] = digito++
            print("[${matriz[i][j] }]")
        }
        println()
    }

    println("numero d linhas: ${matriz.size}")
    println("numero d colunas: ${matriz[0].size}")
}