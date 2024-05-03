package org.example;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class TestaJogo {

    public static void main(String[] args) {

        ArrayList<JogoList> listagamestore = new ArrayList<>();
        JogoList menugame = new JogoList();
        listagamestore.add(menugame);

        while (true) {

            try {

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo à GameStore, sua loja de games favorita! Escolha uma opção e divirta-se em nossa loja! \uD83D\uDC68\u200D\uD83C\uDFFB\u2694\n"
                        + "1. Cadastrar jogo \uD83D\uDCBE\n"
                        + "2. Apagar jogo \uD83D\uDDD1️\n"
                        + "3. Pesquisar jogo por nome \uD83D\uDCDD\n" //
                        + "4. Pesquisar jogos por categoria \uD83D\uDCDD\n"
                        + "5. Pesquisar jogos em promoção \uD83D\uDCC6\n"
                        + "6. Pesquisar jogos gratuitos \uD83C\uDF81\n"
                        + "7. Ver todos os jogos \uD83D\uDCD6\n"
                        + "8. Sair \uD83D\uDEA9"));

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
                        int apagarpeloid = Integer.parseInt(JOptionPane.showInputDialog("digite aqui o id do jogo que voce deseja excluir"));
                        JOptionPane.showMessageDialog(null, "aguardando... se nao icinializar sozinho aprte ok");
                        boolean certeza = Boolean.parseBoolean(JOptionPane.showInputDialog("tem certeza? digite true para sim!, e false para nao!:"));
                        if (certeza == true) {
                            boolean jogoencontrado = false;
                            for (JogoList jogoList : listagamestore) {
                                for (Jogo jogo : menugame.getJogos()) {
                                    if (jogo.getId() == apagarpeloid) {
                                        jogoList.apagarJogoCadastrado(apagarpeloid);
                                        JOptionPane.showMessageDialog(null, "Jogo" + jogo + " apagado com sucesso!");
                                        jogoencontrado = true;
                                        break;
                                    }
                                }
                                if (jogoencontrado) {
                                    break;
                                }
                            }
                            if (!jogoencontrado) {
                                JOptionPane.showMessageDialog(null, "jogo com id:" + apagarpeloid + "nao encontrado");
                            }
                        } else if (!certeza) {
                            JOptionPane.showMessageDialog(null, "operacao cancelada");
                        }
                        break;
                    case 3:
                        String nomedojogo = JOptionPane.showInputDialog("Digite aqui o nome completo do jogo");
                        boolean encontrado = false;
                        for (JogoList jogoList : listagamestore) {
                            for (Jogo jogo : jogoList.getJogos()) {
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
                        String categoriaa = JOptionPane.showInputDialog("digite aqui a categoria do seu jogo para encontra-lo");
                        boolean encontado = false;
                        for (JogoList jogoList : listagamestore) {
                            for (Jogo jogo : jogoList.getJogos()) {
                                if (jogo.getCategoria().equalsIgnoreCase(categoriaa)) {
                                    jogoList.pesquisarJogosPorCategoria(categoriaa);
                                    JOptionPane.showMessageDialog(null, "encontrado!");
                                    JOptionPane.showMessageDialog(null, jogo);
                                    encontrado = true;
                                }
                            }
                        }
                        if (!encontado){
                            JOptionPane.showMessageDialog(null,"nenhum jogo encontrado");
                    }else{

                                JOptionPane.showMessageDialog(null, " nao foi possivel encontrar");
                            }


                        break;

                    case 5:
                        if (menugame.pesquisarJogosEmPromocao()!=null) {
                            String formatadaJogosPromocao = "";
                            for (Jogo c: menugame.pesquisarJogosEmPromocao()){
                                formatadaJogosPromocao += c +"\n";
                            }
                            JOptionPane.showMessageDialog(null, "jogo em promocao encontrado! \n"+ formatadaJogosPromocao);
                        }else{
                            JOptionPane.showMessageDialog(null, " nao foi possivel encontrar jogo em promocao");
                        }
                        break;

                    case 6:
                              if (menugame.pesquisarJogosGratuitos()!=null) {
                                  String formatada = "";
                                  for (Jogo c: menugame.pesquisarJogosGratuitos()){
                                      formatada += c +"\n";
                                  }
                                    JOptionPane.showMessageDialog(null, "jogo gratuito encontrado! \n"+ formatada );
                                }else{
                                    JOptionPane.showMessageDialog(null, " nao foi possivel encontrar jogo  gratuito");
                                }


                        break;

                    case 7:
                        StringBuffer listadejogos = new StringBuffer();
                        for (JogoList jogoList : listagamestore) {
                            for (Jogo jogo : jogoList.getJogos()) {
                                listadejogos.append(jogo).append("\n");
                            }
                        }
                            if (listadejogos.length() > 0) {
                                JOptionPane.showMessageDialog(null, "Lista de jogos:\n" + listadejogos.toString());
                            } else {
                                JOptionPane.showMessageDialog(null, "Nenhum jogo encontrado.");
                        }

                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Obrigado por usar a GameStore! \uD83D\uDEA9"); // Adicionando emoji de agradecimento
                        menugame.salvarCadastros(listagamestore);
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
