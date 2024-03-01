fun main() {
    var vet = doubleArrayOf(3.33, 4.00, 7.5, 1.1, 2.7, 5.5, 6.9, 8.0, 9.9, 10.0)
    var num:Double = 6.0
    var contro: Int = 0
    for(i in vet){
        if(i == num){
            print("numero encontrado")
            contro = 1
            break
        }
    }
    if(contro != 1) {print("numero não encontrado")}
}