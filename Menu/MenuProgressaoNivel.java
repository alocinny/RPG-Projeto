package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Agentes.Agentes;
import SistemaRPG.ProgressaoNivel;

public class MenuProgressaoNivel extends JFrame {

    private int[] sizeWin = {300, 300};
    private String mensagem = "Sem xp suficiente";
    private JFrame frame;
    private JPanel jPanel;
    private JLabel jLabel;
    private JLabel jLabelAfinidade;
    private JLabel jLabelAgilidade;
    private JLabel jLabelXp;
    private JButton jButtonForca;
    private JButton jButtonAgilidade;

    public void winMenuProgressaoNivel(ProgressaoNivel progressaoNivel, Agentes agentes){

        frame = new JFrame("Progressão de nível");
        jLabel = new JLabel();
        jPanel = new JPanel();

        jButtonForca = new JButton("Progredir afinidade");
        jButtonAgilidade = new JButton("Progredir agilidade");

        //mostra na janela a agilidade total do agente
        jLabelAgilidade = new JLabel("Agilidade: " + agentes.getAgilidade());
        jLabelAgilidade.setBounds(50,50,200,30);

        //mostra na janela o vigor total do agente
        jLabelAfinidade = new JLabel("força: " + agentes.getForca());
        jLabelAfinidade.setBounds(50,50,200,30);

        //mostra na janela o xp total do agente
        jLabelXp = new JLabel("pontos de ocultismo: " + agentes.getPtOcultismo());
        jLabelXp.setBounds(50,50,200,30);

        //botao para progredir Afinidade
        jButtonForca.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(agentes.getPtOcultismo()<3){
                    JOptionPane.showMessageDialog(null, mensagem);
                } else {
                    progressaoNivel.newXpDecrementaforca();
                    jLabelAfinidade.setText("força: " + agentes.getForca());
                    jLabelXp.setText("pontos de ocultismo: " + agentes.getPtOcultismo());
                }
            }
        });
        jButtonForca.setBounds(20,40,250,40);

        //botao para progredir Agilidade
        jButtonAgilidade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(agentes.getPtOcultismo()<2){
                    JOptionPane.showMessageDialog(null, mensagem);
                } else {
                    progressaoNivel.newXpDecrementaAgilidade();
                    jLabelAgilidade.setText("Agilidade: " + agentes.getAgilidade());
                    jLabelXp.setText("pontos de ocultismo: " + agentes.getPtOcultismo());
                }
            }
        });
        jButtonAgilidade.setBounds(20,90,250,40);
        
        //adiciona os labels no panel
        jPanel.setVisible(true);
        jPanel.add(jLabel);
        jPanel.add(jLabelAfinidade);
        jPanel.add(jLabelAgilidade);
        jPanel.add(jLabelXp);
        
        //adiciona botoes no panel
        frame.add(jButtonForca);
        frame.add(jButtonAgilidade);
        
        //confugirações da janela
        frame.add(jPanel);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setBounds(600, 200, sizeWin[0], sizeWin[1]);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}