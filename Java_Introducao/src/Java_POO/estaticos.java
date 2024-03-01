package Java_POO;

public class estaticos {
    static int u = 10;
    public static int conta = 0;//nao precisa de um objeto pra acessar

    public estaticos(){
        conta++;
    }
    public static String mensagem(){//metodo estatico
        return "Eai galera!!!!!!!";
    }
    public static void msng(){
        System.out.println("Eai so que void!!!!!");
        int h = u;
    }
}
