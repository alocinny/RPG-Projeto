package Menu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Criaturas.Criaturas;
import Agentes.Agentes;
import SistemaRPG.Combate;

//mostrar os dados quando for fazer a GUI
    //private JLabel jLabelDados;
    //jLabelDados = new JLabel("seus dados:");
    //jLabelDados.setBounds(50,350,200,50);
    //frame.add(jLabelDados); -> mostrar dados (GUI)
    //bug n mostra panel
    //jPanel.add(jLabelScript);
    //jPanel.add(jLabelVidaAgente);
    //jPanel.add(jLabelVidaCriatura);

public class MenuCombate extends JFrame{
    private int[] sizeWin = {600, 600};
    private JFrame frame;
    private JPanel jPanel;
    private JLabel jLabel;
    private JLabel jLabelVidaAgente;
    private JLabel jLabelVidaCriatura;
    private JLabel jLabelScript;
    private JButton jButtonAtacar;
    private JButton jButtonDescarnar;
    private JButton jButtonInfligirDoenca;
    private JButton jButtonDestruicaotemporal;
    private JButton jButtonBencaoMaldita;
    private JButton jButtonInventario;

    private MenuInventario menuInventario = new MenuInventario();
    private Combate combate = new Combate();

    public void winCombate(Agentes agentes, Criaturas criaturas){

        frame = new JFrame("Combate");

        jLabel = new JLabel();

        jPanel = new JPanel();

        jButtonAtacar = new JButton("Ritual Simples");
        jButtonDescarnar = new JButton("Ritual de Descarnar");
        jButtonInfligirDoenca = new JButton("Ritual de Infligir Doença");
        jButtonDestruicaotemporal = new JButton("Ritual de Destruição Temporal");
        jButtonBencaoMaldita = new JButton("Ritual de Benção Maldita");
        jButtonInventario = new JButton("Inventário");

        //mostra informações na janela
        jLabelScript = new JLabel("combate iniciado");
        jLabelScript.setBounds(50,330,200,50);

        //mostra na janela a vida total do agente
        jLabelVidaAgente = new JLabel("Vida do agente: " + agentes.getVida());
        jLabelVidaAgente.setBounds(50,350,200,50);

        //mostra na janela a vida total da criatura
        jLabelVidaCriatura = new JLabel("vida da criatura: " + criaturas.getVida());
        jLabelVidaCriatura.setBounds(50,380,200,50);

        //mostra botao de ritual simples na janela
        jButtonAtacar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                if(criaturas.vivo() && agentes.vivo()){
                    combate.combate(agentes, criaturas, 1);
    
                    //atualiza vida na tela
                    jLabelVidaAgente.setText("Vida do agente: " + agentes.getVida());
                    jLabelVidaCriatura.setText("vida da criatura: " + criaturas.getVida());
                }
            }
        });
        jButtonAtacar.setBounds(20,40,250,40);

        //mostra botao do ritual de descarnar na janela
        jButtonDescarnar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                if(criaturas.vivo() && agentes.vivo()){

                    combate.combate(agentes, criaturas, 2);
    
                    //atualiza vida na tela
                    jLabelVidaAgente.setText("Vida do agente: " + agentes.getVida());
                    jLabelVidaCriatura.setText("vida da criatura: " + criaturas.getVida());
                }
            }
        });
        jButtonDescarnar.setBounds(20,90,250,40);

        //mostra o botao do ritual de infligir doença na janela
        jButtonInfligirDoenca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                if(criaturas.vivo() && agentes.vivo()){

                    combate.combate(agentes, criaturas, 3);
    
                    //atualiza vida na tela
                    jLabelVidaAgente.setText("Vida do agente: " + agentes.getVida());
                    jLabelVidaCriatura.setText("vida da criatura: " + criaturas.getVida());
                }
            }
        });
        jButtonInfligirDoenca.setBounds(20, 140, 250, 40);

        //mostra o botão do ritual de destruição temporal
        jButtonDestruicaotemporal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                if(criaturas.vivo() && agentes.vivo()){

                    combate.combate(agentes, criaturas, 4);
    
                    //atualiza vida na tela
                    jLabelVidaAgente.setText("Vida do agente: " + agentes.getVida());
                    jLabelVidaCriatura.setText("vida da criatura: " + criaturas.getVida());
                }
            }
        });
        jButtonDestruicaotemporal.setBounds(20,190,250,40);

        //mostra o botão do ritual de benção maldita
        jButtonBencaoMaldita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                if(criaturas.vivo() && agentes.vivo()){

                    combate.combate(agentes, criaturas, 5);
                    
                    //atualiza vida na tela
                    jLabelVidaAgente.setText("Vida do agente: " + agentes.getVida());
                    jLabelVidaCriatura.setText("vida da criatura: " + criaturas.getVida());
                }
            }
        });
        jButtonBencaoMaldita.setBounds(20,240,250,40);

        jButtonInventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

            menuInventario.winMenuInventario(agentes);
            }
        });
        jButtonInventario.setBounds(20,290,250,40);

        //adiciona os labels no panel
        jPanel.setVisible(true);
        jPanel.add(jLabel);
        
        frame.add(jLabelScript);
        frame.add(jLabelVidaAgente);
        frame.add(jLabelVidaCriatura);
        frame.add(jButtonAtacar);
        frame.add(jButtonDescarnar);
        frame.add(jButtonInfligirDoenca);
        frame.add(jButtonDestruicaotemporal);
        frame.add(jButtonBencaoMaldita);
        frame.add(jButtonInventario);
        
        //configurações da janela
        frame.add(jPanel);
        frame.setBounds(600, 200, sizeWin[0], sizeWin[1]);
        frame.setLayout(new BorderLayout(10,10));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
