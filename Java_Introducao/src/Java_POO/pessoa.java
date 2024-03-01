package Java_POO;

public class pessoa {
    public String str = "Alan";
    public int ano_nasc = 2003;

    void falar(){
        System.out.println("Ola meu nome é" + str);
    }
    void idade(){
        System.out.println("eu tenho" + (2024-ano_nasc));
    }
}
