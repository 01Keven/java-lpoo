public class Arma{
    private String nome;
    private int dano;
    private int municao;

    public Arma(String nome, int dano, int municao) {
        this.nome = nome;
        this.dano = dano;
        this.municao = municao;
    }

    public void Atirar() {
        this.municao -= 1;
        
        if (this.municao < 0) {
            this.municao = 0;
            System.out.println("Sem munição!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getMunicao() {
        return municao;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    

}
