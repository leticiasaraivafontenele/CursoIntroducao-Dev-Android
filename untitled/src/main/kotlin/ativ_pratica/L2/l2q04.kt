fun main() {

    try {
        println("Digite seu salário: ")
        val salario = readlnOrNull()?.toDouble() ?: 0.0

        if(salario < 1412){
            throw Exception("o salario não pode ser menor que o salário  minimo")
        }

        if( salario < 3000){
            println("o salario liquido é de: ${salario -(salario*0.04)}")
        }else if ( salario < 6000){
            println("o salario liquido é de: ${salario -(salario*0.075)}")
        }else {
            println("o salario liquido é de: ${salario - (salario* 0.11)}")
        }

    }catch (e: Exception){
        println(e.message)
    }catch (e: NumberFormatException){
        println("o salario digitado não pode conter simbolos e caracteres")
    }


}