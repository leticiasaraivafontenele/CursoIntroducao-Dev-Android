fun main() {
    a(false)
    b()
    c()

}
fun a(valor: Any){
    println("imprimindo o valor: $valor")
}
fun b():Unit{
    println("funcao sem retorno")
}
fun c():Nothing{
    TODO("funcao ainda a ser completada")
}