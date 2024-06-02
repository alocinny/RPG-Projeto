package InterfaceMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class MenuCombate extends JFrame{

    private JPanel contentPanel;
    
    public void menuCombate(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        
        JFrame Win = new JFrame("teste");
        Win.setSize(1600, 900);
        Win.setVisible(true);

        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        //botão de atacar
        JButton botaoAtacar = new JButton("ATACAR");
        botaoAtacar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent k){
                JOptionPane.showMessageDialog(null, "voce atacou");
            }
        });
        botaoAtacar.setBounds(300,300,100,30);
        Win.add(botaoAtacar);

        JButton botaoDefender = new JButton("DEFENDER");
        botaoDefender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent k){
                JOptionPane.showMessageDialog(null, "voce defendeu");
            }
        });
        botaoDefender.setBounds(300,350,100,30);
        Win.add(botaoDefender);
    }
}
