package org.example;

import javax.swing.*;

public class TestaJogo {

    public static void main(String[] args) {
        JogoList menugame = new JogoList();
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
                        break;
                    case 2:
                        break;

                    case 3:
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

            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
        }
    }

}
}