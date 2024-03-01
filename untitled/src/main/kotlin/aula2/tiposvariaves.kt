package aula2

fun main() {
    var x: Int = 18 //posso mudar o valor d avariavel
    val y: Int //nn posso mudar o valor
    var a: Float = 19.15f
    var b: Double = 3.3333333333
    var c: Long = 10100101010
    var d: Char = 'g'
    var e: String = "licy"
    var f: Short = 100
    var g: Byte = 0b1010
    var h: Byte = 0xf
    var i: UInt = 12u

    println(x)
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)

//capacidade de variaveis

    println("UInt maximo: ${UInt.MAX_VALUE} UInt minimo: ${UInt.MIN_VALUE}")

}