fun main() {
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.instalar()
    c.varrer()
    println(c.modelo)

    var f: F = F()
    f.teste

    var pc: Eletronico = Computador("dell")
    pc.fazersom()



}
//Private Open Protect
private class F (){//esta disponivel somente no arquivo
var teste = "Classe F"
}

open class Eletronico(marca:String){
    //private fun corrente(){}//private: somente na propria class, nem na main, nem nas herdadas
    fun ligar(){
        println("esta ligad0")

    }
    fun desligar(){
        println("desligado")
    }
    var modelo = "teste ah"

    protected fun relogio(){//somente em classes herdadas
        println("relogio L /")
    }
    open fun fazersom(){
        println("o anial fa zom")
    }
}

class Computador(marcas:String):Eletronico(marcas){
    fun instalar(){
        println("instalindp")
        relogio()
    }
    fun varrer(){
        println("varrer pc")
    }
    override fun fazersom(){
        println(" o choroo dwdsfnkzj")
    }
}