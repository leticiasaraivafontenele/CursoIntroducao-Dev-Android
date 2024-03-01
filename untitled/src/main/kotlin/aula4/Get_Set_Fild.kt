//Função SET - Atribiu um valor ao campo correspondente
//Função GET - Retornar um valor ao campo correspondente
// Função Field - Evita chamadas infinitas

class Planet(var nome: String){
    private var id = 1
    var tamanho = 1000
    var fala = "terra"

        get(){
            println("acessando Get")
            return field
        }
        set(value) {
            println("acessando set")
            field = value
        }
}
class Planeta2(){
    var nome:String = ""
        get(){
            println("meu valor é $field")
            return field
        }
        set(value) {
            if(value == ""){
                println("Todo planeta tem nome")
            }else{
                field = value
            }
        }
}

fun main() {
    var M :Planet = Planet("Marte")
    println("imprimindo tamanho: ${M.tamanho}")
    var P :Planet = Planet("Plutao")
    P.fala
    P.fala = "novo planeta plutao"

    var p2:Planeta2 = Planeta2()
    p2.nome = ""
    println(p2.nome)
    p2.nome = "Jupiter"
    println(p2.nome)

}