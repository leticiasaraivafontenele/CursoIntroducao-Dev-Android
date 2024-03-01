package Java_POO;

public abstract class Funcionario {//Final = restringe a mesma de herança
    public String nome;
    protected int idade;
    protected float slario;
    protected float bonus;
    protected float horaextra(int h, int f){
        return (h*1.5f) +(f *2f);
    }
    public void saudacao(){
        System.out.println("Olá");
    }

    public final int teste = 20;//variavel constante(final)

    public final void trabalhar(){//nao podear ser feito override(final)
    }
    public void trabalhar(int i){
    }

    public abstract void pagarImposto();//nao pode ter metodo abstrato se a classe nao for abstrata
}
