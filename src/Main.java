public class Main {

    public static void main(String[] args) {
        Guerreiro aragorn = new Guerreiro("Aragorn");
        Mago gandalf = new Mago("Gandalf");

        Jogador player1 = new Jogador("PlayerOne", aragorn);
        Jogador player2 = new Jogador("WizardMaster", gandalf);

        System.out.println("--- O DUELO VAI COMEÇAR ---");
        player1.exibirInfo();
        player2.exibirInfo();
        System.out.println("----------------------------------------");

        int turno = 1;

        while (aragorn.isVivo() && gandalf.isVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");

            if (turno % 2 != 0) {
                System.out.println("Turno de " + player1.getNomeUsuario() + " (" + aragorn.getNome() + ")");
                aragorn.atacar(gandalf);
            } else {
                System.out.println("Turno de " + player2.getNomeUsuario() + " (" + gandalf.getNome() + ")");

                ((Conjurador) gandalf).lancarMagia(aragorn);
            }

            turno++;
        }

        System.out.println("\n----------------------------------------");
        System.out.println("--- FIM DE JOGO ---");

        if (aragorn.isVivo()) {
            System.out.println("O vencedor é " + player1.getNomeUsuario() + " com seu personagem " + aragorn.getNome() + "!");
            player1.exibirInfo();
        } else {
            System.out.println("O vencedor é " + player2.getNomeUsuario() + " com seu personagem " + gandalf.getNome() + "!");
            player2.exibirInfo();
        }
    }
}