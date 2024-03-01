class ContaBancaria( private var titular:String, private var saldo:Int){
    fun Get_Saldo(){
        println("O saldo atual da conta é: $saldo")
    }
    fun depositar(valor:Int){
        if(valor >10000){
            println("O limite maximo para deposito é de 10000 reais")
        }else{
            saldo += valor
        }
    }
    fun sacar(valor:Int){
        if (valor>saldo){
            println("Saldo insuficiente! Saque não realizado")
        }else if(valor== saldo){
            saldo = 0
            println("Saque realizado! Conta zerada.")
        }else if(valor > 50000){
            println("Saque não realizado! -limite por saque: 50.000 reais")
        }else{
            saldo -= valor
            println("Saque realizado!")
        }
    }
}

fun main() {

}