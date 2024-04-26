package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class TestaJogo {

    public static void main(String[] args) {

        ArrayList<JogoList> listagamestore = new ArrayList<>();
        JogoList menugame = new JogoList();
        listagamestore.add(menugame); // Adiciona o menugame à lista

        while (true) {

            try {

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo à GameStore, sua loja de games favorita! Escolha uma opção e divirta-se em nossa loja!\n"
                        + "1. Cadastrar jogo\n"
                        + "2. Apagar jogo\n"
                        + "3. Pesquisar jogo por nome\n"
                        + "4. Pesquisar jogos por categoria\n"
                        + "5. Pesquisar jogos em promoção\n"
                        + "6. Pesquisar jogos gratuitos\n"
                        + "7. Ver todos os jogos\n"
                        + "8. Sair"));

                switch (opcao) {
                    case 1:
                        String nomeDoJogo = JOptionPane.showInputDialog("Digite o nome do jogo: ");
                        String dataPublicacao = JOptionPane.showInputDialog("Digite a data de publicação: ");
                        String categoria = JOptionPane.showInputDialog("Categoria do Jogo: ");
                        String avaliacaoString = JOptionPane.showInputDialog("Avaliação (0 á 5): ");
                        double avaliacaoDouble = Double.parseDouble(avaliacaoString);
                        String precoString = JOptionPane.showInputDialog("Qual é o preço do jogo? ");
                        double precoDouble = Double.parseDouble(precoString);
                        String descontoString = JOptionPane.showInputDialog("Qual é o desconto do jogo? ");
                        double descontoDouble = Double.parseDouble(descontoString);
                        menugame.cadastrarJogo(nomeDoJogo, dataPublicacao, categoria, avaliacaoDouble, precoDouble, descontoDouble);
                        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                        break;

                    case 2:

                        break;

                    case 3:
                        String nomedojogo = JOptionPane.showInputDialog("Digite aqui o nome completo do jogo");
                        boolean encontrado = false;
                        for (JogoList listagaemstore : listagamestore) {
                            for (Jogo jogo : listagaemstore.getJogos()) {
                                if (jogo.getNome().equalsIgnoreCase(nomedojogo)) {
                                    JOptionPane.showMessageDialog(null, jogo);
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (encontrado) {
                                break;
                            }
                        }
                        if (!encontrado) {
                            JOptionPane.showMessageDialog(null, "Jogo não encontrado.");
                        }
                        break;

                    case 4:

                        break;

                    case 5:

                        break;

                    case 6:
                        break;

                    case 7:

                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Obrigado por usar a GameStore!");
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
            }
        }
    }
}
