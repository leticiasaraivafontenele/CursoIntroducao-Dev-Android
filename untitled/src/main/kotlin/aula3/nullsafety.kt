fun main() {
    var str:String? = null

    println(str?.length)//kotlin faz o tratamento de excecao

    str = "qualquer coisa"
    println(str!!.length)//eu tenho q tratar o erro
    print("teste ah")

    var a= 10/0
}