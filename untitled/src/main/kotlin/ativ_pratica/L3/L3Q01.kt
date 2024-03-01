class Animal(var nome:String, var classe:String, var peso: Int, var patas: Int){

    fun som(som:String){
        println("O/A ${nome} faz ${som}")
    }
    fun andar(){
        println("O/A ${nome} anda sobre ${patas}")
    }
    fun acordar(x:Boolean){
        if(x){
            println("O/A ${nome} esta acordado")
        }else{
            println("O/A ${nome} esta dormindo")
        }
    }
    fun comer(comida:String){
        println("O/A ${nome} come ${comida}")
    }
}

fun main() {
    var nomes: Array<String> = Array(8){""}
    var classes: Array<String> = Array(8){""}
    var pesos: Array<Int> = Array(8){0}
    var patass: Array<Int> = Array(8){0}
    var sons: Array<String> = Array(8){""}
    var comidas: Array<String> = Array(8){""}
    var mimir: Array<Boolean> = Array(8){false}

    for (i in 0 until 8){
        println("Digite o nome do ${i + 1}° animal: ")
        nomes[i] = readlnOrNull()?:""
        println("Digite a classe do ${i + 1}° animal: ")
        classes[i] = readlnOrNull()?:""
        println("Digite o peso do ${i + 1}° animal: ")
        pesos[i] = readlnOrNull()?.toInt()?:0
        println("Digite a quantidade de patas do ${i + 1}° animal: ")
        patass[i] = readlnOrNull()?.toInt()?:0
        println("Digite o som que o ${i + 1}° animal faz: ")
        sons[i] = readlnOrNull()?:""
        println("Digite o que o ${i + 1}° animal come: ")
        comidas[i] = readlnOrNull()?:""
        println("O ${i + 1}° animal esta acordado?: ")
        mimir[i] = readlnOrNull()?.toBoolean()?:false
    }
    for (i in 0 until 8){
        var animal:Animal =Animal(nomes[i], classes[i], pesos[i], patass[i])
        println("..............Caracteristicas do(a) ${nomes[i]}: ............")
        println( animal.nome)
        println(animal.classe)
        println(animal.peso)
        println(animal.patas)
        println("Ações do(a) ${nomes[i]}: ")
        animal.acordar(mimir[i])
        animal.som(sons[i])
        animal.andar()
        animal.comer(comidas[i])
    }
}