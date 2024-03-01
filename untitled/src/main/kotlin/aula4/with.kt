class OBJ{
    fun amanhecer(n:Int){
        if(n <= 4 && n >=0){
            println("esta de madrugada")
        }else{
            println("esta de dia")
        }
    }
    fun acordar(n: Int){
        if(n == 0){
            println("esta dormindo")
        }else{
            println("esta acordado")
        }

    }
}

fun main() {
    var obj:OBJ = OBJ()
    obj.acordar(5)
    obj.amanhecer(3)
    println("...........................................................................................................")
    with(obj){
        acordar(1)
        amanhecer(0)
    }
}