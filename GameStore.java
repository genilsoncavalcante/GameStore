import java.util.List;

public interface GameStore {
    public boolean cadastrarJogo(Jogo jogo);
    public boolean apagarJogoCadastrado(int id);
    public List<Jogo> getJogos();
    public List<Jogo> pesquisarJogosPorCategoria(String categoria);

}
