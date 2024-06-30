package Menu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Agentes.Agentes;
import SistemaRPG.Inventario;

public class MenuInventario extends JFrame{

    private int[] sizeWin = {600, 600};
    private JFrame frame;
    private JPanel jPanel;
    private JLabel jLabel;
    private JLabel jLabelItens;

    public void winMenuInventario(Inventario inventario, Agentes agente){

        frame = new JFrame("Inventário");
        jLabel = new JLabel();
        jPanel = new JPanel();

        jLabelItens = new JLabel(" " + agente.getInventario());
        jLabelItens.setBounds(50,50,200,30);

        jPanel.add(jLabel);
        jPanel.add(jLabelItens);

        frame.add(jPanel);
        frame.setBounds(600, 200, sizeWin[0], sizeWin[1]);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLayout(null);
    }
}