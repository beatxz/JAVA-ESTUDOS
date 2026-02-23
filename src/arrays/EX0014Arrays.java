package arrays;

import javax.swing.*;

public class EX0014Arrays {
    public static void main(String[] args) {

          String[] opcoes = new String[]{
                  "Série La casa de papel",
                  "Filme You",
                  "Filme Vingadores",
                  "Sair"
          };
          int opcaoEscolhida=0;

          while(opcaoEscolhida<3){
              opcaoEscolhida= JOptionPane.showOptionDialog(
                      null,
                      "o que voce deseja assistir?",
                      "devFlix",
                      JOptionPane.DEFAULT_OPTION,
                      JOptionPane.QUESTION_MESSAGE,
                      null,
                      opcoes,
                      0
              );
              if (opcaoEscolhida<3 ){
                  String mensagem = "Voce assistiu "+opcoes[opcaoEscolhida];
                  JOptionPane.showMessageDialog(null, mensagem);
              }
          }

    }
}
