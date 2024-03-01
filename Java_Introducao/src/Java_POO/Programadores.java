package Java_POO;

public class Programadores {
    public static void main(String[] args) {
        System.out.println(Senhoridade.JUNIOR.id);

        for (Senhoridade s: Senhoridade.values()){
            System.out.println("O programador "+ s + " deve ter "+ s.id + " anos de experiencia");
        }
    }
}
