package MenuCombate;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Janela {
    public static void main (String[] args) {

        JLabel label = new JLabel("MENU COMBATE", JLabel.CENTER); //adicionar textos
        label.setFont(new Font("Calibri", Font.BOLD, 40)); // fonte da escrita
        label.setForeground(Color.white); // cor da fonte 


        JFrame janela = new JFrame ();
        janela.setVisible(true); //deixa tela visivel
        janela.setSize( 800, 500); //tamanho janela
        janela.add(label);
        janela.getContentPane().setBackground(new Color(200,30,50)); //cor da janela
        janela.setTitle("RPG");
    }

   
}
