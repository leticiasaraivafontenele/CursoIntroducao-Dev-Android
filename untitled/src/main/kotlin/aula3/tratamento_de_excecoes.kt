import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivo(){
    var arquivo = File("C:\\Users\\licys\\Favorites\\untitled\\src\\main\\kotlin\\aula3\\passo a passo.txt")

    try{
        Scanner(arquivo).use {l ->
            while(l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        println("falha ao ler o arquivo")
    }
}

fun main() {
    ler_arquivo()
}