fun reais(){
    println("os reais contem os racionais...")
    racionais()
}
fun racionais(){
    println("os racionais contem os inteiros...")
    inteiros()
}
fun inteiros(){
    println("os inteiros contem os naturais...")
    naturais()
}
fun naturais(){
    println("e os naturais contem o 0.")
}

fun main() {
    reais()
}