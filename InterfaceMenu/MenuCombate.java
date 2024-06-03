package InterfaceMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import Personagens.Personagens;
import Agentes.Ocultista;
import Inimigos.Aberracao;

public class MenuCombate extends JFrame {
    private JPanel contentPanel;
    private int escolha;
    private final int atacar = 1;
    private final int defender = 2;
    private JLabel labelVidaOcultista;
    private JLabel labelVidaAberracao;
    private Personagens ocultista;
    private Personagens aberracao;

    public MenuCombate(Personagens ocultista, Personagens aberracao) {
        this.ocultista = ocultista;
        this.aberracao = aberracao;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        // Criar janela principal
        setTitle("Combate");
        setSize(1600, 900);
        setVisible(true);
        setLayout(null);

        // Botão de atacar
        JButton botaoAtacar = new JButton("ATACAR");
        botaoAtacar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent k) {
                escolhaMenu(atacar);
                realizarAcao();
            }
        });
        botaoAtacar.setBounds(300, 300, 100, 30);
        add(botaoAtacar);

        // Botão de defender
        JButton botaoDefender = new JButton("DEFENDER");
        botaoDefender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent k) {
                escolhaMenu(defender);
                realizarAcao();
            }
        });
        botaoDefender.setBounds(300, 350, 100, 30);
        add(botaoDefender);

        // Labels para exibir a vida dos personagens
        labelVidaOcultista = new JLabel("Vida Ocultista: " + ocultista.getVida());
        labelVidaOcultista.setBounds(50, 50, 200, 30);
        add(labelVidaOcultista);

        labelVidaAberracao = new JLabel("Vida Aberração: " + aberracao.getVida());
        labelVidaAberracao.setBounds(50, 100, 200, 30);
        add(labelVidaAberracao);
    }

    public void escolhaMenu(int escolhaId) {
        this.escolha = escolhaId;
    }

    public int getEscolhaMenu() {
        return this.escolha;
    }

    public void resetEscolhaMenu() {
        this.escolha = 0;
    }

    public void atualizarStatus() {
        labelVidaOcultista.setText("Vida Ocultista: " + ocultista.getVida());
        labelVidaAberracao.setText("Vida Aberração: " + aberracao.getVida());
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void realizarAcao() {
        if (ocultista.getVida() > 0 && aberracao.getVida() > 0) {
            if (escolha == 1) {
                // Ocultista ataca Aberração
                int danoOcultista = ocultista.ataque(aberracao.getAgilidade());
                int novaVidaAberracao = aberracao.dano(aberracao.getVida(), danoOcultista);
                aberracao.setVida(novaVidaAberracao);

                // Aberração ataca Ocultista
                int danoAberracao = aberracao.ataque(ocultista.getAgilidade());
                int novaVidaOcultista = ocultista.dano(ocultista.getVida(), danoAberracao);
                ocultista.setVida(novaVidaOcultista);
            } 
          /*  else if (escolha == 2) {
                // Ocultista defende
                int danoAberracao = aberracao.ataque(ocultista.getAgilidade());
                int danoDefendido = ocultista.defender(danoAberracao);
                int novaVidaOcultista = ocultista.dano(ocultista.getVida(), danoDefendido);
                ocultista.setVida(novaVidaOcultista);
            }*/

            // Atualizar a interface gráfica
            atualizarStatus();

            // Condições de término da batalha
            if (ocultista.getVida() <= 0) {
                mostrarMensagem("Ocultista foi derrotado!");
            } else if (aberracao.getVida() <= 0) {
                mostrarMensagem("Aberração foi derrotada!");
            }

            // Resetar a escolha do menu para continuar a batalha
            resetEscolhaMenu();
        }
    }
}
        
