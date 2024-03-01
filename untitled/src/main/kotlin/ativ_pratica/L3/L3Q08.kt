class Funcionario(var Nome:String, var Sal:Float, var Matri: Int, var Cargo: String){

    var car:String =""
        get(){
            Cargo = field
            return field
        }
        set(value) {
            field = value
        }

    var saliro:Float = 0.0f
        get(){
            Sal = field
            return field
        }
        set(value) {
            field = value*3.0f
        }

    var mati:Int = 0
        get(){
            Matri = field
            return field
        }
        set(value) {
            field = value
        }

    fun Get_Nome():String{
        return Nome
    }
    fun Get_Slario():Float{
        return Sal
    }
    fun Get_Cargo():String{
        return Cargo
    }
    private fun Aumentar_Salario(perecntual:Float){
        Sal += Sal*perecntual
    }
    private fun Promover(Novo_Cargo:String){
        Cargo = Novo_Cargo
    }
}

fun main() {
    var func:Funcionario = Funcionario("James", 2000.0f, 1234567, "Estagiario")
    println("Informacoes do funcionario..............................")
    println("Nome: ${ func.Get_Nome()}")
    println("Cargo: ${ func.Get_Cargo()}")
    println("Salario: ${func.Get_Slario()}")

    println("Esse funcionario foi promovido?")
    var resp = readlnOrNull()?.toBoolean()?:false
    if (resp){
        println("Informe a nova matricula: ")
        var newmatri = readlnOrNull()?.toInt()?:0
        func.mati = newmatri
        func.saliro = 1000.0f
        println("Informacoes do funcionario..............................")
        println("Nome: ${ func.Get_Nome()}")
        println("Cargo: ${ func.Get_Cargo()}")
        println("Salario: ${func.Get_Slario()}")
    }

}