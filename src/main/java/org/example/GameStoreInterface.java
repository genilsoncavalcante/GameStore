package org.example;

import java.util.List;

public interface GameStoreInterface {

    public boolean cadastrarJogo(Jogo jogo);
    public boolean apagarJogoCadastrado(int id);
    public List<Jogo> getJogos();
    public List<Jogo> pesquisarJogosPorCategoria(String categoria);

}
