fun main() {
    var str: String? =null
    str = "shuya"

    if(str == null){
        println("variavel nula")
    }else{
        println(str)
    }

    //operador elvis
    println(str?: "variavel nula")
}