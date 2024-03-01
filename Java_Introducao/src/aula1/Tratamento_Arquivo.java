package aula1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tratamento_Arquivo {
    public static void main(String[] args) {

        try{

        String caminho = "C:\\Users\\licys\\Favorites\\Java_Introducao\\src\\teste.txt";
        FileReader arquivolido = new FileReader(caminho); //encontar o arquivo
        BufferedReader leitor = new BufferedReader(arquivolido); //lê o arquivo

        String linha;
        while ((linha = leitor.readLine())!= null){
            System.out.println(linha);
        }
        leitor.close();
        }catch (IOException e){
            System.err.println("Erro ao ler o arquivo!");
        }

    }
}
