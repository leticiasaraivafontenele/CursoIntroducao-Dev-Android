package Java_POO;

public class base {
    public static void main(String[] args) {

        cliente c = new cliente();
        c.nome = "James";
        System.out.println("O nome dele é: " + c.nome);

        c.consumo = 123.3f;
        System.out.println("consumo: "+c.consumo);

        c.setSobrenome("Silva");
        System.out.println("o sobrenome é: "+c.getSobrenome());

        /*try {
            c.setAno_nasc(1999);
            System.out.println("Ele nasceu em: "+c.getAno_nasc());

        }catch (Exception e){
            System.err.println(e.getMessage());
        }*/

        c.setAno_nasc(1999);
        System.out.println("Ele nasceu em: "+c.getAno_nasc());

        cliente c2 = c;
        c2.setSobrenome("lima");
        System.out.println("pessoa 1: "+c.getSobrenome());
        System.out.println("pessoa 2: "+c2.getSobrenome());
    }
}
