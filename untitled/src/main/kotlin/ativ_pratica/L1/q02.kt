fun main() {
    var notas = floatArrayOf(7.4f, 6.3f, 8.0f, 5.7f)
    var soma: Float = 0.0f
    var resp: Float = 0.0f

    for(i in 0 until notas.size){
        soma += notas[i]
    }
    resp = soma/(notas.size)
    println("a media das notas foi ${resp}")
    println()

    if(resp > 10 && resp<0){
        println("notas invalidas")
    }else if(resp<4){
        println("reprovado")
    }else if(resp < 7){
        println("AF")
    }else{
        println("Aprovado")
    }
}