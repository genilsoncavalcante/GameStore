
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JogoList implements GameStore {

    private List<Jogo> jogos;
    GravadorJogos gravador = new GravadorJogos();

    public JogoList() {
        try {
            this.jogos = gravador.lerJogos();
        }catch (IOException e){
            System.err.println(e.getMessage());
            this.jogos = new ArrayList<Jogo>();
        }
    }

    @Override
    public boolean cadastrarJogo(Jogo jogo) {
        try {
            this.jogos.add(jogo);
            return true;
        } catch (Exception e) {
            return false;
        }


    }

    @Override
    public boolean apagarJogoCadastrado(int id) {
        for (Jogo c : jogos) {
            if (c.getId() == id) {
                jogos.remove(c);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Jogo> getJogos() {
        return jogos;
    }

    public Jogo pesquisarJogoPorNome(String nome) throws JogoNaoEncontradoException {
        for (Jogo c : jogos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        throw new JogoNaoEncontradoException("Jogo não encontrado");
    }

    @Override
    public List<Jogo> pesquisarJogosPorCategoria(String categoria) {
        List<Jogo> jogos_categoria = new ArrayList<>();
        for (Jogo c : jogos) {
            if (c.getCategoria().equalsIgnoreCase(categoria)) {
                jogos_categoria.add(c);
            }
        }
        return jogos_categoria;
    }

    public List<Jogo> pesquisarJogosEmPromocao() {
        List<Jogo> jogos_em_promocao = new ArrayList<>();
        for (Jogo c : jogos) {
            if (c.getValorDesconto() > 0) {
                jogos_em_promocao.add(c);
            }
        }
        return jogos_em_promocao;
    }

    public List<Jogo> pesquisarJogosGratuitos() {
        List<Jogo> jogos_gratuitos = new ArrayList<>();
        for (Jogo c : jogos) {
            if (c.getPreco() == 0) {
                jogos_gratuitos.add(c);
            }
        }
        return jogos_gratuitos;
    }
    public void SalvarCadastros(List<Jogo> jogos){
        try {
            this.gravador.gravarJogo(this.jogos);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }

}

