package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Agentes.Agentes;
public class MenuInventario extends JFrame{

    private int[] sizeWin = {600, 600};
    private JFrame frame;
    private JPanel jPanel;
    private JLabel jLabel;
    private JLabel jLabelItens;
    private JButton jButtonRemoverItem;

    public void winMenuInventario(Agentes agente){

        frame = new JFrame("Inventário");
        jLabel = new JLabel();
        jPanel = new JPanel();

        jLabelItens = new JLabel(agente.getInventario());
        jLabelItens.setBounds(50,50,200,30);

        jButtonRemoverItem = new JButton("remover item");
        jButtonRemoverItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                jLabel.setText(agente.getInventario());
            }
        });
        jButtonRemoverItem.setBounds(20,40,250,40);

        jPanel.add(jLabel);
        jPanel.add(jLabelItens);
        frame.add(jButtonRemoverItem);

        frame.add(jPanel);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setBounds(600, 200, sizeWin[0], sizeWin[1]);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}