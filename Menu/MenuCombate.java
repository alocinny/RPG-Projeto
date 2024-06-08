package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Criaturas.Criaturas;
import Agentes.Agentes;

public class MenuCombate extends JFrame{

    private int[] sizeWin = {600, 600};
    private JFrame frame;
    private JPanel jPanel;
    private JLabel jLabel;
    private JLabel jLabelVidaAgente;
    private JLabel jLabelVidaCriatura;
    private JLabel jLabelScript;
    private JButton jButtonAtacar;
    private JButton jButtonDefender;

    public void winCombate(Agentes agentes, Criaturas criaturas){

        frame = new JFrame("Progressão de nível");
        jLabel = new JLabel();
        jPanel = new JPanel();
        jButtonAtacar = new JButton("Atacar");
        jButtonDefender = new JButton("Defender");
        
        //mostra o script na janela
        jLabelScript = new JLabel("combate iniciado");
        jLabelScript.setBounds(50,50,200,50);

        //mostra na janela a vida total do agente
        jLabelVidaAgente = new JLabel("Vida do agente: " + agentes.getVida());
        jLabelVidaAgente.setBounds(50,50,200,50);

        //mostra na janela a vida total da criatura
        jLabelVidaCriatura = new JLabel("vida da criatura: " + criaturas.getVida());
        jLabelVidaCriatura.setBounds(50,50,200,50);

        //mostra botao de atacar na janela
        jButtonAtacar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
            }
        });
        jButtonAtacar.setBounds(20,90,250,40);

        //mostra botao de defender na janela
        jButtonDefender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
            }
        });
        jButtonDefender.setBounds(20,40,250,40);

        //adiciona os labels no panel
        jPanel.add(jLabel);
        jPanel.add(jLabelVidaAgente);
        jPanel.add(jLabelVidaCriatura);
        jPanel.add(jLabelScript);

        frame.add(jButtonAtacar);
        frame.add(jButtonDefender);

        //configurações da janela
        frame.add(jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, sizeWin[0], sizeWin[1]);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
