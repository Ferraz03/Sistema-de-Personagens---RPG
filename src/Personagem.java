public abstract  class Personagem {
    private String nome;
    private int pontosDeVida;
    protected int forca;

    public Personagem(String nome, int pontosDeVida, int forca) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
    }

    public abstract void atacar(Personagem alvo);

    public void receberDano(int dano){
        if (dano > 0){
            this.pontosDeVida -= dano;
            System.out.println(this.nome + "recebeu " + dano + " de dano! Vida restante: " + this.pontosDeVida);
            if (this.pontosDeVida <= 0) {
                System.out.println(this.nome + " foi derrotado!");
            }
        }
    }

    public String getNome(){
        return nome;
    }

    public int getPontosDeVida(){
        return pontosDeVida;
    }

    public boolean isVivo(){
        return this.pontosDeVida > 0;
    }

}
