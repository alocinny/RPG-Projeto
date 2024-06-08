package Menu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import SistemaRPG.Inventario;

public class MenuInventario extends JFrame{

    private int[] sizeWin = {600, 600};
    private JFrame frame;
    private JPanel jPanel;
    private JLabel jLabel;
    private JLabel jLabelRituaLcura;
    private JLabel jLabelChaves;
    private JLabel jLabelObjAmaldicoado;

    public void winMenuInventario(Inventario inventario){

        frame = new JFrame("Inventário");
        jLabel = new JLabel();
        jPanel = new JPanel();

        jLabelRituaLcura = new JLabel("Ritual de cura: " + inventario.getRitualCura());
        jLabelRituaLcura.setBounds(50,50,200,30);

        jLabelChaves = new JLabel("Chaves: " + inventario.getChave());
        jLabelChaves.setBounds(50,50,200,30);

        jLabelObjAmaldicoado = new JLabel();
        jLabelObjAmaldicoado.setText("Objetos amaldiçoados: " + inventario.getObjAmaldicoado());
        jLabelObjAmaldicoado.setBounds(50,50,200,30);

        jPanel.add(jLabel);
        jPanel.add(jLabelRituaLcura);
        jPanel.add(jLabelChaves);
        jPanel.add(jLabelObjAmaldicoado);

        frame.add(jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, sizeWin[0], sizeWin[1]);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}