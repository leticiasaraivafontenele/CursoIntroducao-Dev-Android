open class eletronic(var marca:String){
    private fun corrente(ativo: Boolean){

    }
    open fun ligar(){
        corrente(true)
    }
    open fun desligar(){
        corrente(false)
    }
}
class PC(marca: String):eletronic(marca){
    fun salvar(){}

    override fun desligar() {
        salvar()
        super.desligar()
    }

    override fun ligar() {
        super.ligar()
    }

}
class SmarTv(marca: String):eletronic(marca){
    override fun ligar() {
        super.ligar()
    }

    override fun desligar() {
        super.desligar()
    }
}

fun main() {
    var pc: PC = PC("dell")
    pc.ligar()
    pc.salvar()
    pc.desligar()

}