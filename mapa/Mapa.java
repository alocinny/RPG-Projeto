import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Mapa {

    public static void main(String[] args) {
        
        // obtem e coloca a imagem dentro de uma BufferedImage

        BufferedImage img = null; //inicializacao da variavel

        try {
            img = ImageIO.read(new File("imagemverde.jpg"));
        } catch (IOException e ){
            e.printStackTrace();
        }

        // Cria e configura o texto JLabel

        JLabel label = new JLabel();
        label.setText("MAPA"); //texto
        label.setFont(new Font("Calibri", Font.BOLD, 120)); //fonte em negrito
        label.setForeground(Color.white); //cor do texto
        label.setHorizontalTextPosition(JLabel.CENTER); // configura posicao do texto

        // Criar e configura a janela

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(1280, 720);

        Image dimg = img.getScaledInstance(janela.getWidth(), janela.getHeight(),
        Image.SCALE_SMOOTH);

        ImageIcon imageIcon = new ImageIcon(dimg);
        label.setIcon(imageIcon);

        // mostra a janela e adiciona o label a ela
        janela.setVisible(true);
        janela.add(label);




    }

    




}