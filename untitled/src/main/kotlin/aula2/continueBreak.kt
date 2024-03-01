package aula2

fun main() {
    var str = "shuya the cat"
    var j = 0
    /*while(j < str.length){
        if(str[j] == 'c'){break}

        print("${str[j]}")
        j++
    }*/
    for(i in 0 ..20) {
        if (i%2 == 1) {
            continue
        }
        print("${i} ")
    }
}