package Java_POO;

public class Main_Func {
    public static void main(String[] args) {
        Operario op = new Operario();
        op.nome = "james";
        op.idade = 24;
        op.slario = 1000;
        op.bonus = 30f;
        float h = op.horaextra(10,10);
        System.out.println("O ganho mensal do "+op.nome+ " é "+(op.slario + op.bonus + h));
        op.saudacao();

        //Funcionario f = new Funcionario(); nao pode criar objetos de classes abstratas


        Funcionario f1 = new Operario();


    }
    private  static  void Polimorfismo(Funcionario f){
        f.pagarImposto();
    }
}
