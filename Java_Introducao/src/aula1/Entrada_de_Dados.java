package aula1;

import java.util.Scanner;

public class Entrada_de_Dados {
    public static void main(String[] args) {
        Scanner vari = new Scanner(System.in);
        System.out.print("informe um numero inteiro: ");
        int x = vari.nextInt();
        System.out.println("o numero digitado foi: " + x);

        System.out.print("digite um numero decimal: ");
        Double y = vari.nextDouble();
        System.out.println("o numero digitado foi: " + y);

        vari.nextLine();
        System.out.print("digite um nome: ");
        String str = vari.nextLine();
        System.out.println("o numero digitado foi: " + str);

    }
}
