package Java_POO;

public class Main_Contrutor {
    public static void main(String[] args) {
        Construtor c = new Construtor(19);
        System.out.println(c.idade);
        System.out.println(c.nome);
        System.out.println(c.saldo);
        Construtor c2 = new Construtor();
        System.out.println(c2.idade);
        System.out.println(c2.nome);
        System.out.println(c2.saldo);
    }
}
