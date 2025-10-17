public class Jogador {
    private String nomeUsuario;
    private Personagem personagemControlado;

    public Jogador(String nomeUsuario, Personagem personagem){
        this.nomeUsuario = nomeUsuario;
        this.personagemControlado = personagem;
    }

    public void exibirInfo(){
        System.out.println("Jogador: " + this.nomeUsuario);
        System.out.println("Personagem: " + this.personagemControlado.getNome());
        System.out.println("Vida Atual: " + this.personagemControlado.getPontosDeVida());
    }

    public String getNomeUsuario(){
        return nomeUsuario;
    }
    public Personagem getPersonagemControlado(){
        return personagemControlado;
    }
}
