class Pessoa(val ano_nasc:Int, var nome:String){
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
    var people: Pessoa = Pessoa(2004, "Dalila")
    println(people.ano_nasc)
    println("voce tem ${people.idade} anos")
    people.saudacao()
    people.acordar(false)

}