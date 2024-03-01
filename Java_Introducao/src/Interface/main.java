package Interface;

public class main {
    public static void main(String[] args) {
        Computador pc = new Computador();

        pc.ligar();
        pc.desligar();
        pc.testar();

        int x = pc.y;
    }
}
