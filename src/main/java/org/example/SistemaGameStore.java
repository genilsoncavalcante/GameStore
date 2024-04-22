package org.example;

import java.util.List;

public class SistemaGameStore {
    public static void main(String[] args) {
        JogoList meusJogos = new JogoList();

        //teste de verificação
        meusJogos.cadastrarJogo("Resident Evil", "10/01/2005", "Terror", 4.7, 97.88, 20.0);
        meusJogos.cadastrarJogo("Selent Hill", "16/11/2007", "Terror", 4.9, 102.98, 20.0);
        System.out.println(meusJogos.getJogos());

    }
}
