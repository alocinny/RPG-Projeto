package SistemaRPG;

import java.awt.event.*;

public class Movimentacao implements KeyListener {
    private int tecla;

    @Override
    public void keyReleased(KeyEvent e){}
    
    @Override
    public void keyPressed(KeyEvent e){
        tecla = e.getKeyCode();

        switch (tecla) {

            case KeyEvent.VK_UP:

                //adicinar movimentação vertical para cima (update Y)
                break;
            case KeyEvent.VK_DOWN:

                //adicinar movimentação vertical para baixo (update Y)
                break;
            case KeyEvent.VK_LEFT:

                //adicinar movimentação horizontal para esquerda (update X)
                break;
            case KeyEvent.VK_RIGHT:

                //adicinar movimentação horizontal para direita (update X)
                break;   
            default:

                break;
        }
        //adicionar método para redesenhar sprite do jogador
    }

    @Override
    public void keyTyped(KeyEvent e) {}

}
