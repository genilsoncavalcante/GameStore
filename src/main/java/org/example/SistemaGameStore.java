package org.example;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class SistemaGameStore {
    public static void main(String[] args) throws JogoNaoEncontradoException {
        JogoList meusJogos = new JogoList();

        //teste de verificação
        meusJogos.cadastrarJogo("Resident Evil", "10/01/2005", "Terror", 4.7, 97.88, 20.0);
        meusJogos.cadastrarJogo("Selent Hill", "16/11/2007", "Terror", 4.9, 102.98, 20.0);
        System.out.println(meusJogos.getJogos());


        //Menu
        boolean continuar = true;
        while (continuar){
            String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar Jogo\n2.Apagar um jogo pelo ID\n3.Pesquisar Jogo por nome\4.Sair");
            switch(opcao){
                case "1" :
                    String nomeDoJogo = JOptionPane.showInputDialog("Digite o nome do jogo: ");
                    String dataPublicacao = JOptionPane.showInputDialog("Digite a data de publicação: ");
                    String categoria = JOptionPane.showInputDialog("Categoria do Jogo: ");
                    String avaliacaoString = JOptionPane.showInputDialog("Avaliação (0 á 5): ");
                    double avaliacaoDouble = Double.parseDouble(avaliacaoString);
                    String precoString = JOptionPane.showInputDialog("Qual é o preço do jogo? ");
                    double precoDouble = Double.parseDouble(precoString);
                    String descontoString = JOptionPane.showInputDialog("Qual é o desconto do jogo? ");
                    double descontoDouble = Double.parseDouble(descontoString);

                    //usar try catch aqui!
                    meusJogos.cadastrarJogo(nomeDoJogo, dataPublicacao, categoria, avaliacaoDouble, precoDouble, descontoDouble);
                    JOptionPane.showMessageDialog(null, "Jogo cadastrado com sucesso");
                break;

                case "2":
                    String idDoJogo = JOptionPane.showInputDialog("Para apagar um Jogo, digite o seu id: ");
                    int idDoJogoInt = Integer.parseInt(idDoJogo);
                    meusJogos.apagarJogoCadastrado(idDoJogoInt);
                break;

                case "3":
                    String jogo = JOptionPane.showInputDialog("Digite o nome do Jogo: ");
                    Jogo jogoEncontrado = meusJogos.pesquisarJogoPorNome(jogo);
                    JOptionPane.showMessageDialog(null, "Jogo:" + jogoEncontrado.toString());
                break;

                case "4":
                    continuar = false;
                break;
            }
        }
    }
}