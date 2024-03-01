package Java_POO;

public class Operario extends Funcionario {
    public int meta;

    @Override
    public void saudacao(){
        System.out.println("Ola, turubom?");


    }

    @Override
    public void pagarImposto() {
        System.out.println("o operarido paga 15% de imposto");
    }
}
