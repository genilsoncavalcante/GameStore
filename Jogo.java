package org.example;

public class Jogo {
    private int id;
    private String nome;
    private String dataPublicacao;
    private String categoria;
    private double avaliacao;
    private double preco;
    private boolean desconto;

    public Jogo(int id, String nome, String dataPublicacao, String categoria, double avaliacao, double preco, boolean desconto) {
        this.id = id;
        this.nome = nome;
        this.dataPublicacao = dataPublicacao;
        this.categoria = categoria;
        this.avaliacao = avaliacao;
        this.preco = preco;
        this.desconto = desconto;
    }

    public Jogo() {
        this(0, "", "", "", 0.0, 0.0, false);
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

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

}
