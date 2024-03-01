class Aluno(private var nome:String, private var matricula: Int, private var notas:Array<Float>){
    fun get_nome(){
        println("O nome do aluno é: $nome")
    }
    fun get_matricula(){
        println("A matricula de $nome é $matricula")
    }
    fun get_media(){
        var soma:Float = 0.0f
        for (i in 0 until notas.size){
            soma += notas[i]
        }
        println("A média das notas de $nome é: ${soma/notas.size}")
    }
    fun Add_Notas(novasnotas: Array<Float>){
        notas = novasnotas
    }
    init {
        try {
            for (i in notas) {
                if (i > 10 || i < 0) {
                    throw IllegalArgumentException()
                }
            }
        }catch (e: IllegalArgumentException ){
            println("Notas incoerentes! As notas devem ser de 0 a 10")
        }
    }
}

fun main() {

}