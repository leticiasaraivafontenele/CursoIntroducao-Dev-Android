package Interface;

public class Computador implements Maquina, teste{

    @Override
    public void ligar() {
        System.out.println("computador lingado.......");
    }

    @Override
    public void desligar() {
        System.out.println("computador deslingado.......");
    }

    @Override
    public void testar() {
        System.out.println("computador testando.......");
    }
}
