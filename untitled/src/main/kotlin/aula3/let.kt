fun main() {
    var str: String? = null
    str = "shuya"

    if(str != null){
        println("caiu no if")
    }

    str?.let {
        println("let<3")
    }
}