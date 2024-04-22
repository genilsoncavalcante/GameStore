package org.example;

import java.util.List;

public interface GameStore {

    public boolean cadastrarJogo(String nome, String dataPublicacao, String categoria, double avaliacao, double preco, double valorDesconto);
    public boolean apagarJogoCadastrado(int id);
    public List<Jogo> getJogos();
    public List<Jogo> pesquisarJogosPorCategoria(String categoria);

}
