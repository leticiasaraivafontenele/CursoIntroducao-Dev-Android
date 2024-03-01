class Pessoa2(val ano_nasc:Int, var nome:String){
    var idade = 2024 - ano_nasc
        fun saudacao(){
            println("Seja bem vindo ${this.nome}")
        }
    fun acordar(x:Boolean = true){
        if(x){
            println("${this.nome} esta acordado")
        }else{
            println("${this.nome} esta dormindo")
        }

    }

}

fun main() {
    println("Digite seu ano de nascimento: ")
    var x = readlnOrNull()?.toInt() ?: 0
    println("Digite seu nome completo: ")
    var y = readln()
    println("Voce esta acordado? ")
    var d = readlnOrNull()?.toBoolean() ?: false
    var people: Pessoa2 = Pessoa2(x, y)
    println(people.ano_nasc)
    println("voce tem ${people.idade} anos")
    people.saudacao()
    people.acordar(d)

}