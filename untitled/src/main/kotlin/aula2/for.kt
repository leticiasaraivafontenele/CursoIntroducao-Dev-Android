package aula2

fun main() {
    for(i in 1 ..10){
        print("${i} ")
    }
    print("\n")

    for(i in 20 downTo 1){
        print("${i} ")
    }
    print("\n")

    var str: String = "shuya goenji"
    for(i in str){
        print("${i} ")
    }
    print("\n")
    for(i in 1 ..10 step 2){
        print("${i} ")
    }

}