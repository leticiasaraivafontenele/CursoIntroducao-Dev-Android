import kotlin.math.abs
import kotlin.math.sqrt

abstract class Forma(){
    abstract fun CalcularArea()
}
class Triangulo(var lado1:Float, var lado2:Float, var lado3:Float): Forma() {
    init {
        try {
            if (lado1<= 0||lado2<=0||lado3<=0){
                throw IllegalArgumentException()
            }
        }catch(e:IllegalArgumentException){
            println("Não existe área negativa!")
        }
        if(!((lado1 > abs((lado2 - lado3))) && (lado1 < lado2 + lado3)) || !((lado2 > abs((lado1 - lado3))) && (lado2 < lado1 + lado3) )|| !((lado3 > abs((lado1 - lado2))) && (lado3 < lado1 + lado2))){
            println("Os lados não representam lados de um triangulo")
            }
    }
    override fun CalcularArea() {
        var p = (lado1 + lado2 + lado3)/2
        println("A área do triangulo é: ${sqrt(p*(p-lado1)*(p-lado2)*(p-lado3))} ")
    }
}
class Quadrado(var lado:Float): Forma(){
    init {
        try {
            if (lado<=0){
                throw IllegalArgumentException()
            }
        }catch(e:IllegalArgumentException){
            println("Não existe área negativa!")
        }
    }
    override fun CalcularArea() {
        println("A area desse quadrado é: ${lado*lado}")
    }
}
class Circulo(var raio:Float):Forma(){
    init {
        try {
            if (raio<=0){
                throw IllegalArgumentException()
            }
        }catch(e:IllegalArgumentException){
            println("Não existe área negativa!")
        }
    }
    override fun CalcularArea() {
        println("A área do circulo é: ${3.1415f*raio*raio}")
    }
}


fun main() {
    var quadr:Quadrado =Quadrado(2.5f)
    var tri:Triangulo =Triangulo(3.0f, 4.0f, 5.0f)
    var circ:Circulo = Circulo(4.0f)

    println(quadr.CalcularArea())
    println(tri.CalcularArea())
    println(circ.CalcularArea())


}