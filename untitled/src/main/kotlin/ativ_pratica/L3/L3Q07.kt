interface Veiculos{
    fun mover()
}
class carro():Veiculos{
    override fun mover() {
        println("O carro anda sob a terra")
    }

}
class aviao():Veiculos{
    override fun mover() {
        println("O avião voa sob o céu")
    }
}
class lancha():Veiculos{
    override fun mover() {
        println("A lancha desliza sob a água")
    }
}
fun GoGo(v:Veiculos){
    v.mover()
}
fun main() {
    GoGo(aviao())
    GoGo(carro())
    GoGo(lancha())
}