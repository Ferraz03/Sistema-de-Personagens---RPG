public class ArenaDeDuelos {
    public void iniciarDueloDeMagia(Conjurador mago, Personagem alvo){
        System.out.println("--- Duelo de Magia Iniciado ---");
        mago.lancarMagia(alvo);
        System.out.println("--- Duelo de Magia Finalizado ---");
    }
}
