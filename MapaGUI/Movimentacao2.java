package MapaGUI;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movimentacao2 extends JFrame implements KeyListener {
    
    // Posição inicial do personagem
    private int personagemX = 100;
    private int personagemY = 200;
    
    // Tamanho do passo do movimento
    private static final int PASSO = 50;

    // Construtor da classe
    public Movimentacao2() {
        // Configuração da janela
        setSize(1400, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Adicionar o KeyListener à janela para capturar eventos de teclado
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);  // Para capturar as setas do teclado corretamente
    }

    // Sobrescrita do método paint
    public void paint(Graphics g) {
        super.paint(g);  // Chama o método paint da superclasse JFrame

        
        // Desenha o mapa
        g.setColor(Color.green);
       //metodos de desenhar um retangulo preenchido
            //casa 2
            g.fillRect(100, 200, 150, 150);
            //casa 4 
            g.fillRect(350, 200, 150, 150);
            //casa 6
            g.fillRect(600, 200, 150, 150);
            //casa 8
            g.fillRect(850, 100, 150, 150);
            //casa 10
            g.fillRect(1110, 100, 150, 350);
            //casa 1
            g.fillRect(100, 550, 150, 150);
            //casa 3
            g.fillRect(350, 550, 150, 150);
            //casa 5
            g.fillRect(600, 550, 150, 150);
            //casa 7
            g.fillRect(850, 550, 150, 150);
            //casa 9
            g.fillRect(1110, 600, 150, 150);
        // Desenha o personagem (um retângulo vermelho simples como exemplo)
        g.setColor(Color.red);
        g.fillRect(personagemX, personagemY, 30, 30);
    }

    // Implementação dos métodos da interface KeyListener
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
    
        // Obtém as dimensões da janela
        int windowWidth = getWidth();
        int windowHeight = getHeight();
    
        // Movimentação do personagem com restrição às bordas da tela
        if (key == KeyEvent.VK_LEFT && personagemX - PASSO >= 0) {
            personagemX -= PASSO;
        } else if (key == KeyEvent.VK_RIGHT && personagemX + PASSO + 30 <= windowWidth) {
            personagemX += PASSO;
        } else if (key == KeyEvent.VK_UP && personagemY - PASSO >= 1) {
            personagemY -= PASSO;
        } else if (key == KeyEvent.VK_DOWN && personagemY + PASSO + 40 <= windowHeight) {
            personagemY += PASSO;
        }
    
        // Redesenha a tela após o movimento
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {}

    // Método main
    public static void main(String[] args) {
        new Movimentacao2();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}

