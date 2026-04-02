package POO.InterfaceGrafica.Ex001;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JButton button = new JButton("Click here");

        button.setBounds(0, 0, 150, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked on the button");

            }
        });
        window.setLayout(null);
        window.setBounds(0,0,400,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(button);
    }
}
