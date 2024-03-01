fun main() {
    var num:Int
    do{
        println("digite um numero da sequncia de fibonacci: ")
        num = readLine()?.toInt() ?:0
    }while (num < 2)

    var fibo = 0
    var fiboant = 1
    var fiboantnat = 1

    var i = 2
    while (fibo < num){
        fibo = fiboant + fiboantnat
        fiboantnat = fiboant
        fiboant = fibo
        i++
    }
    if (fibo == num) {
        println("o numero ${num} esta na ${i}° posicao na sequncia de fibonacci")
    }else{println("o numero ${num} nao esta na sequencia de fibonacci")}
}