package MenuCombate;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form extends JFrame { 

    //componentes
    JButton cmd_lutar; //definicao da existencia dos botoes
    JButton cmd_fugir;

    //eventos 

    ActionListener cmd_lutar_click;
    ActionListener cmd_fugir_click;



    

    public Form(String titulo, Dimension dimensao) {
        super(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimensao);
        setLayout(null);


        //===============================================================
        //EVENTOS
        // cmd_sair_click
        
        
        cmd_lutar_click = new ActionListener() {public void actionPerformed(ActionEvent e) {
                System.out.println("Voce clicou para lutar");
                //System.exit(0); fecha a janela (usar para caso queira sair do jogo)
            }
        
        };

        cmd_fugir_click = new ActionListener() {public void actionPerformed(ActionEvent e) {
            System.out.println("Voce clicou para fugir");
            //System.exit(0); fecha a janela (usar para caso queira sair do jogo)
        }
    
    };

        //criar os botoes


        cmd_lutar = new JButton("Lutar");
        cmd_lutar.setBounds(50,50,120,30); // localizacao do botao
        cmd_lutar.addActionListener(cmd_lutar_click);

        cmd_fugir = new JButton("Fugir");
        cmd_fugir.setBounds(200,50,120,30); // localizacao do botao
        cmd_fugir.addActionListener(cmd_fugir_click);

        //adicionar os botoes ao formulario

        add(cmd_lutar);
        add(cmd_fugir);


    }
}
