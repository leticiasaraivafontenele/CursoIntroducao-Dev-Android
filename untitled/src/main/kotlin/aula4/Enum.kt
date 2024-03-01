enum class Prioridade{
    Baixa, Media, Alta
}
enum class Animais{
    gato, cachorro, tucano, papagaio, leopardo
}
enum class Prioridade2(val v:Int){
    B(0), M(7), A(10)

}
enum class Prioridade_3(val valor: Int){
    A(10){
        override fun toString(): String {
            return "Prioridade ALTA com o valor $valor"
        }
    },
    M(7){
        override fun toString(): String {
            return "Prioridade MEDIA com o valor $valor"
        }
    },
    B(0){
        override fun toString(): String {
            return "Prioridade BAIXA com o valor $valor"
        }
    }
}

fun xis(p:Prioridade){

}

fun main() {
    xis(Prioridade.Alta) //forma de acessar um valor da classe do tipo Enum
    for (p in Prioridade.entries){
        print("$p ")
    }
    println("")
    for (p in Animais.values()){
        print("$p ")
    }
    println("")
    for (p in Prioridade2.entries){
        print("${p.v} ")
    }
    println("")
    for (p in Prioridade_3.values()){
        println("${p} ")
    }

}