import java.util.Scanner

fun lerint(){
    val scanner = Scanner(System.`in`)
    println("digite um numero inteiro: ")
    val num = scanner.nextInt()
    println("voce digitou o numero: ${num+1}")
}
fun lerstr(){
    val scanner = Scanner(System.`in`)
    println("digite um numero inteiro: ")
    val num = scanner.next()
    println("voce digitou o numero: ${num+1}")
    scanner.close()
}

//ser for double ou float tem que digitar com virgula nao com ponto

fun main() {
    lerint()
    lerstr()
}