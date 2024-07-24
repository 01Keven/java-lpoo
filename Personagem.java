public class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    private int mana;
    private int defesa;
    private int dano;
    
    // Construtor
    public Personagem(String nome, int nivel, int vida, int mana, int defesa, int dano) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
        this.defesa = defesa;
        this.dano = dano;
    }

    // Metodos
    public void Evoluir( int upNivel, int upVida, int upMana, int upDefesa, int upDano) {
        this.nivel += upNivel;
        this.vida += upVida;
        this.mana += upMana;
        this.defesa += upDefesa;
        this.dano += upDano;
    }

    public void SofrerDano(int danoSofrido) {
        this.vida -= danoSofrido;

        if (this.vida < 0) {
            this.vida = 0;
            System.out.println("Seu Personagem " + this.nome + " chegou a 0 de vida! GAME OVER!");
            System.exit(0);
        }
        
    }

    // Get e Set

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }

    
}
