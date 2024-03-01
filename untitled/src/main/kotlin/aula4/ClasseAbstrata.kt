interface Selvagem{//se implementar TEM que usar TODOS os metodos //nao pode iniciar variaveis
    fun atacar(){
        println("ATAQUE AUAUAUAUUAUAUAU")

    }
}
interface Fourpatas{
fun andar(){
    println("o animal anda em 4 patas")

}
}

abstract class Mamifero(var nome: String):Selvagem{ //classe abstrata so serve para heramça, nn pode ser criada//pode iniciar variaves
    fun habiat(){}
    fun acordado(){}
    abstract fun fale()
    abstract fun alimentacao()
    fun tempo(){
        println("tempo do mamifero")
    }
}
class cachoro(nome: String):Mamifero(nome),Fourpatas{//nao se pode hesdar duas classes ao mesmo tmpo. tem q ser escalonado
    override fun fale() {
        println("au-au")
    }

    override fun alimentacao() {
        println("racao")
    }

    override fun atacar() {
        println("o dogo ataca AUAUAUAUUAUUUAUAUUAUAUA")
    }
}

fun main() {
    //var m : Mamifero = Mamifero()
    var d: cachoro = cachoro("wolf")
    d.tempo()
    d.habiat()
    d.fale()
    d.alimentacao()
    d.atacar()
    d.andar()
}