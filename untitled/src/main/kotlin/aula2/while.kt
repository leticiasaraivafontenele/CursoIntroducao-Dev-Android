package aula2

fun main() {
    /*var str:String = "shuya the cat"
    var j: Int = 0

    while(j < str.length){
        print("${j} ")
        j++
    }
    print("${str[2]}")*/

    var i:Int = 0
    do{
        print("${i} ")
        i++
    }while(i != 10)

    print("\n")
    do{
        print("qual e o seu nome?")
        var value = readLine()
    }while(value == "")
}
