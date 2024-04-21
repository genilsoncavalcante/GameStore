package org.example;

public class SistemaGameStore {
    public static void main(String[] args) {
        GameStore meusJogos = new JogoList();
        Jogo resident_evil = new Jogo(1, "Resident Evil", "10/01/2005", "Terror", 4.7, 97.88, 20.0);

        //teste de verificação
        System.out.println(meusJogos.cadastrarJogo(resident_evil));
        resident_evil.toString();

        System.out.println(meusJogos.getJogos());

    }
}
