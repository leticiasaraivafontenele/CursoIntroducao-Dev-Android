package Java_POO;

public class Construtor {
    public Integer idade;
    public Float saldo;
    public String nome;

    public Construtor(int idade){
        this.idade = idade;
        saldo = 0.0f;
        nome = "james";
    }
    public Construtor(){
        idade = 0;
        saldo = 0.0f;
        nome = "james";
    }
}
