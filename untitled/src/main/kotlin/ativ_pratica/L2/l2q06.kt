import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun lerarquivo() {

    println("Digite o endereço do arquivo txt")
    val nome = readlnOrNull()

    try {
        var arquivo = File(nome)
        Scanner(arquivo).use { l->
            while (l.hasNext()) {
                println(l.next())
            }
            l.close()
        }
    }catch (e:FileNotFoundException){
        println("falha ao ler o arquivo!")
    }
}
fun main(){
    lerarquivo()

}
