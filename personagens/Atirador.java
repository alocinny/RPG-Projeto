package personagens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Atirador extends JPanel implements KeyListener{
    private int vida;
    private int danoProjetil;
    private int danoMolotov;

    private int playerX = 50;
    private int playerY = 50;
    private int dimensionX = 1600;
    private int dimensionY = 900;

    public void atirador(){
        this.vida = 80;
        this.danoProjetil = 10;
        this.danoMolotov = 15;
    }

    public int ataque(int escolha){
        switch(escolha){
            case 1:
                return danoProjetil;
            case 2: 
                return danoMolotov;
            default:
                return 0;
        }
    }

    public void LevarDano(int danoLevado){
        vida -= danoLevado;
    }

    public boolean Vivo(){
        return vida > 0;
    }

    public void Movimento() {
        setPreferredSize(new Dimension(dimensionX, dimensionY));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillRect(playerX, playerY, 20, 20);
    }

    public void keyPressed(KeyEvent k) {
        int key = k.getKeyCode();

        
            if (key == KeyEvent.VK_LEFT) {
                

                playerX -= 5;
                
            }
    
            if (key == KeyEvent.VK_RIGHT) {
                playerX += 5;
            }

        if(playerY > 0 || playerY <= 900){

            if (key == KeyEvent.VK_UP) {
                playerY -= 5;
            }
    
            if (key == KeyEvent.VK_DOWN) {
                playerY += 5;
            }
        }

        repaint();
    }

    public void keyReleased(KeyEvent k) {
    }

    public void keyTyped(KeyEvent k) {
    }

    public void rodar() {
        JFrame frame = new JFrame("Player Movement");
        Movimento panel = new Movimento();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        panel.requestFocusInWindow();
    }
}