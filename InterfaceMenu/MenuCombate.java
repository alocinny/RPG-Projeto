package InterfaceMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class MenuCombate extends JFrame{

    private JPanel contentPanel;

    private int escolha;
    private int atacar = 1;
    private int defender = 2;
    
    public void menuCombate(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(10,10,10,10));
        
        JFrame Win = new JFrame("teste");
        Win.setSize(1600, 900);
        Win.setVisible(true);

        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        //botão de atacar
        JButton botaoAtacar = new JButton("ATACAR");
        botaoAtacar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent k){
                escolhaMenu(atacar);
                getEscolhaMenu();
                JOptionPane.showMessageDialog(null, "voce atacou");
            }
        });
        botaoAtacar.setBounds(300,300,100,30);
        Win.add(botaoAtacar);

        //botão de defender
        JButton botaoDefender = new JButton("DEFENDER");
        botaoDefender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent k){
                escolhaMenu(defender);
                getEscolhaMenu();
                JOptionPane.showMessageDialog(null, "voce defendeu");
            }
        });
        botaoDefender.setBounds(300,350,100,30);
        Win.add(botaoDefender);
    }

    public void escolhaMenu(int escolhaId){
        this.escolha = escolhaId;
    }

    public int getEscolhaMenu(){
        return this.escolha;
    }
}