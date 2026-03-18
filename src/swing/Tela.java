package swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Minha Janela");

        JButton botao = new JButton("Clique aqui");


        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Você clicou no botão!");
            }
        });

        janela.add(botao);

        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}