package Java_POO;

public class main_estaticos {
    public static void main(String[] args) {
        System.out.println(estaticos.conta);
        for (int i = 0; i < 5; i++){
            estaticos.conta++;
        }
        System.out.println(estaticos.conta);

        new estaticos();
        new estaticos();
        new estaticos();

        System.out.println(estaticos.conta);

        System.out.println(estaticos.mensagem());
        estaticos.msng();
    }
}
