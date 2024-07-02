package Menu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Agentes.Agentes;
import SistemaRPG.ProgressaoNivel;

public class MenuJogo extends JFrame{
    private int[] sizeWin = {300,300};
    private JFrame frame;
    private JPanel jPanel;
    private JLabel jLabel;
    private JButton jButtonProgressao;
    private JButton jButtonInventario;
    private MenuInventario menuInventario = new MenuInventario();
    private MenuProgressaoNivel menuProgressaoNivel = new MenuProgressaoNivel();

    public void winMenuJogo(ProgressaoNivel progressaoNivel, Agentes agente){
        frame = new JFrame("Menu");
        jLabel = new JLabel("MENU");
        jPanel = new JPanel();
        jButtonInventario = new JButton("inventário");
        jButtonProgressao = new JButton("progressão de nível");

        jButtonInventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                menuInventario.winMenuInventario(agente);
            }
        });
        jButtonInventario.setBounds(20, 40, 250, 40);

        jButtonProgressao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                menuProgressaoNivel.winMenuProgressaoNivel(progressaoNivel, agente);
            }
        });
        jButtonProgressao.setBounds(20, 90, 250, 40);

        jPanel.setBounds(30,10,250,20);
        jLabel.setBounds(30,10,250,20);

        jPanel.setVisible(true);
        jPanel.add(jLabel);
        frame.add(jPanel);
        frame.add(jButtonInventario);
        frame.add(jButtonProgressao);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setBounds(600, 200, sizeWin[0], sizeWin[1]);
        frame.setLayout(new BorderLayout(5,0));
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
