fun main() {
    var ret: Retangulo = Retangulo(2, 4)
    var ret2: Retangulo = Retangulo(2, 4)
    //Equals, toString, hashCode
    println(ret.equals(ret2))//compara os endereços de memoria

    var ret3: RetanguloData = RetanguloData(2, 4)
    var ret4: RetanguloData = RetanguloData(2, 4)
    println(ret3.equals(ret4))

    var ret5: RetanguloData = RetanguloData(-3, 17)
    ret5 = ret4.copy()
    println(ret5.toString())
}

class Retangulo( var a:Int, var b:Int){
    /*override fun equals(other: Any?): Boolean {
        return if (other is Retangulo){
            (other.a == this.a && other.b == this.b)
        }else{
            false
        }
    }*/
}
data class RetanguloData(var a: Int, var b: Int)

data class info(val rua: String, val num: Int, val bairro: String, val cep: Int, val cidade: String){}

fun endereco(e: info){

}