package Java_POO;

public class cliente {
    public String nome;
    private int ano_nasc;
    protected Float consumo;
    private String sobrenome;

    //get e set

    public int getAno_nasc() {
        return ano_nasc;
    }

    /*public void setAno_nasc(int ano_nasc) throws Exception{
        if ((ano_nasc<1950) ||(ano_nasc>2007)){
            throw new Exception("ano de nascimento invelido");
        }
        this.ano_nasc = ano_nasc;
    }*/

    public void setAno_nasc(int ano_nasc) {
        if ((ano_nasc<1950) ||(ano_nasc>2007)){
            this.ano_nasc = 0;
        }
        this.ano_nasc = ano_nasc;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
//public nao restringe
//private fica disponivel so dentro da classe
//protect  esta disponivel ao pacote(projeto)
