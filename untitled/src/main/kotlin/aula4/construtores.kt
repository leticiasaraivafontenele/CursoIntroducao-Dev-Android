open class silvestre(var nome: String){

    var atk:Int = 0
    constructor(nome:String, atak: Int): this(nome){
        this.atk = atak
    }
    fun AP(){
        println("meu animal silvestre é $nome e seu ataque é $atk")
    }
}
class coelho(var nomes :String):silvestre(nomes){
    
    }
}

fun main() {
    var s1 = silvestre("serpente")
    var s2 = silvestre("aguia", 1000)
    s1.AP()
    s2.AP()

    var coelhi:coelho = coelho("bunny", 1000)


}