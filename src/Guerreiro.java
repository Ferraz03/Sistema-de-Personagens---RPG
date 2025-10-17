public class Guerreiro extends Personagem{
    public Guerreiro(String nome){
        super(nome, 150, 15);
    }

    @Override
    public void atacar(Personagem alvo){
        System.out.println(this.getNome() + " ataca com sua espada!");
        alvo.receberDano(this.forca);
    }
}
