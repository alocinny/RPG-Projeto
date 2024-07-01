package Menu;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Agentes.Agentes;
public class MenuInventario extends JFrame{

    private int[] sizeWin = {300,300};
    private JFrame frame;
    private JPanel jPanel;
    private JLabel jLabel;
    private JLabel jLabelItens;

    public void winMenuInventario(Agentes agente){

        frame = new JFrame("Inventário");
        jLabel = new JLabel("ITENS");
        jPanel = new JPanel();
        
        jLabelItens = new JLabel(agente.getInventario());
        jLabelItens.setBounds(20,40,250,40);

        jPanel.setBounds(30,10,250,20);
        jLabel.setBounds(30,10,250,20);
        
        jPanel.setVisible(true);
        jPanel.add(jLabel);
        frame.add(jPanel);
        frame.add(jLabelItens);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setBounds(600, 200, sizeWin[0], sizeWin[1]);
        frame.setLayout(new BorderLayout(5,0));
        frame.setVisible(true);
        frame.setLayout(null);
    }
}