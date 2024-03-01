class carros(var modelo:Int, var gasolina:String, var cor:String,
             var motor:String, var marca:String, var metodo:String){

    var model:String = ""
    init {
        when (modelo) {
            1 -> model = "Sedan"
            2 -> model = "SUV"
            3 -> model = "Picape"
            else -> println("modelo nn identificado")
        }
    }
    fun tipo(){
        if (gasolina.lowercase() == "baixo") {
            println("o carro é economico!")
        }else{
            println("o carro tem um consumo normal/alto")
        }
    }
}

fun main() {
    var carac: Array<Array<String>> = Array(3){Array(5) {" "}}
    var tipos: Array<Int> = Array(3){0}

    for (i in 0 until 3){

        println("Qual o tipo do ${i +1}° carro?")
        tipos[i] = readlnOrNull()?.toInt()?:0

        println("Qual o consumo de gasolina do ${i +1}° carro?")
        carac[i][0] = readlnOrNull()?.toString()?:""
        println("Qual a cor do ${i +1}° carro?")
        carac[i][1] = readlnOrNull()?.toString()?:""
        println("Qual o motor do ${i +1}° carro?")
        carac[i][2] = readlnOrNull()?.toString()?:""
        println("Qual a marca do ${i +1}° carro?")
        carac[i][3] = readlnOrNull()?.toString()?:""
        println("Qual o metodo de consumo do ${i +1}° carro?")
        carac[i][4] = readlnOrNull()?.toString()?:""
    }

    for (i in 0 until 3){
        var carro:carros = carros(tipos[i], carac[i][0], carac[i][1],carac[i][2],carac[i][3],carac[i][4],)
        println(".........................Carro ${i+1}.............................")
        println( carro.model)
        println(carro.cor)
        println(carro.gasolina)
        println(carro.motor)
        println(carro.marca)
        println(carro.metodo)
        carro.tipo()
    }






}