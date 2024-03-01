package Java_POO;

public enum Senhoridade {
    APRENDIZ(1), JUNIOR(5), PLENOR(10), SENIOR(15), ESPECIALISTA(20);
    public int id;
    Senhoridade(int id){
        this.id = id;
    }
}
