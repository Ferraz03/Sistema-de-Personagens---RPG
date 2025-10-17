public class Mago extends Personagem implements Conjurador {
    private int pontosdeMana;
    private int inteligencia;

    public Mago(String nome) {
        super(nome, 80, 5);
        this.pontosdeMana = 100;
        this.inteligencia = 20;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.getNome() + " ataca com seu cajado!");
        alvo.receberDano(this.forca);
    }

    @Override
    public void lancarMagia(Personagem alvo) {
        int custoDeMana = 25;
        if (this.pontosdeMana >= custoDeMana) {
            this.pontosdeMana -= custoDeMana;
            int danoMagico = this.inteligencia * 2;
            System.out.println(this.getNome() + " lança uma Bola de Fogo em " + alvo.getNome() + "!");
            alvo.receberDano(danoMagico);
        } else {
            System.out.println(this.getNome() + " não tem mana suficiente para lançar a magia!");
        }
    }
}
