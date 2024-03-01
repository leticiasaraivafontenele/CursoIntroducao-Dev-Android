class Produto(private var Nome:String, private var Preço:Float, private var Qnt_Estoque:Int){

    fun Get_Nome(){
        println(Nome)
    }
    fun Get_Preco(){
        println(Preço)
    }
    fun Get_EStoque(){
        println(Qnt_Estoque)
    }
    fun Att_Preço(valor:Float){
        Preço = valor
    }
    fun Att_Estoque(quant:Int){
        if((Qnt_Estoque + quant) < 0){
            println("Estoque insuficiente!")
        }else{
            Qnt_Estoque += quant
        }
    }
    init {
        if (Qnt_Estoque <= 5){
            println("Produto com quantidade baixa! Fazer novo pedido com urgencia")
        }
        if (Qnt_Estoque >= 100){
            Preço -= Preço*0.4f
            println("Quantidade alta do $Nome! Favor oferecer com 40% de desconto")
        }
    }
}

fun main() {

}