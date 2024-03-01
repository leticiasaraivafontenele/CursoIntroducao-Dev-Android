fun main() {
    var num:Int = 21
    var controle = 0

    if(num==1 || num<1 || num%2 == 0) {
        println("não é um numero primo")
    }else {
        for (i in 3 until num) {
            if (num % i == 0) {
                println("não é um número primo")
                controle = 1
                break
            }
        }
        if(controle != 1){println("é um numero primo")}
    }
}