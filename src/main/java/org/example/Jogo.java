package org.example;
import java.io.Serializable;
import java.util.Objects;

public class Jogo implements Serializable {
    private int id;
    private String nome;
    private String dataPublicacao;
    private String categoria;
    private double avaliacao;
    private double preco;
    private double valorDesconto;

    public Jogo(int id, String nome, String dataPublicacao, String categoria, double avaliacao, double preco, double valorDesconto) {
        this.id = id;
        this.nome = nome;
        this.dataPublicacao = dataPublicacao;
        this.categoria = categoria;
        this.avaliacao = avaliacao;
        this.preco = preco;
        this.valorDesconto = valorDesconto;
    }

    public Jogo() {
        this(0, "", "", "", 0.0, 0.0, 0.0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", dataPublicacao='" + this.dataPublicacao + '\'' +
                ", categoria='" + this.categoria + '\'' +
                ", avaliacao=" + this.avaliacao +
                ", preco=" + this.preco +
                ", valorDesconto=" + this.valorDesconto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return id == jogo.id && Double.compare(avaliacao, jogo.avaliacao) == 0 && Double.compare(preco, jogo.preco) == 0 && Double.compare(valorDesconto, jogo.valorDesconto) == 0 && Objects.equals(nome, jogo.nome) && Objects.equals(dataPublicacao, jogo.dataPublicacao) && Objects.equals(categoria, jogo.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataPublicacao, categoria, avaliacao, preco, valorDesconto);
    }
}
