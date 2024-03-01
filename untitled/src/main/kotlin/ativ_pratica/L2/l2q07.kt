fun main() {

    var num:Int
    var resp:Int = 1
    do{
        println("Digite um numero entre 0 e 9: ")
        num = readLine()?.toInt() ?: 0

    }while(num>9 ||num<0)

    for (i in 1 .. num){
        resp *= i
    }
    println("o fatorial de ${num} é: ${resp}")
}