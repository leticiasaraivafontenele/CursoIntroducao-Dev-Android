package aula1;

import java.util.Scanner;

public class EntradaDadosVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tam = scanner.nextInt();

        int vetor[] = new int[tam];
        System.out.println("Digite os elementos do vetor: ");
        for(int i = 0; i < tam; i++){
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Vetor lido: ");
        for(int i = 0; i < tam; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println(vetor);

        scanner.close();
    }
}
