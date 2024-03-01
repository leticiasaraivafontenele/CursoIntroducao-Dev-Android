interface Evento{
    fun okay(){

    }
}
class Programa{
    fun salvar(e:Evento){
        println("abrindo")
        println("salvando")
        println("conexoes")
        println("finalizar")
        e.okay()

    }
}/*
class Event():Evento{
    override fun okay() {
        println("ta tudo okay so vai")
    }
}*/

fun main() {
    val p:Programa=Programa()
    //val e:Event = Event()
    //p.salvar(e)
    p.salvar(object :Evento{
        override fun okay() {
            println("TA TUDO OAKY VAAAI")
        }
    })

}