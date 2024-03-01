fun primos(x:Int){
    var controle = 0

    if(x ==1 || x<1 || x%2 == 0) {
        println("não é um numero primo")
    }else {
        for (i in 3 until x) {
            if (x% i == 0) {
                println("não é um número primo")
                controle = 1
                break
            }
        }
        if(controle != 1){println("é um numero primo")}
    }

}

fun main() {
    var num: Int = 15
    primos(num)
}