package aula2

fun main() {
    var cargo:String = "codernador"

    when(cargo){
        "presidente" -> println(6000f)
        "gerente" -> println(4500f)
        "cooerdenador" -> println(3000f)
        "analista" -> println(2400f)
        "estagiario" -> println(1600f)
        else -> println("cargo nn identificado")
    }
}