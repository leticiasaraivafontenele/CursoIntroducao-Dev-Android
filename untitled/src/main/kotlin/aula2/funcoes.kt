package aula2

fun nada(){
    println("funcao sem parametro e sem retorno")
}
fun soma(a:Int, b:Int):Int{
    return(a + b)
}

fun main(){
    var x = 3
    var y = 5
    nada()
    print(soma(x, y))
}