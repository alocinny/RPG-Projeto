package Mapa;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

// criando desenhos com o java swing 
// metodo paint

// classe herdando de jframe
    public class Mapa extends JFrame {
        //construtor da classe
        public Mapa() {
            
            //metodos de configuracao de uma janela
            setSize(1400,1000);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            
        }

        //sobrescrita do metodo paint
        public void paint(Graphics g){
            //g é um objeto
            
            //x1 é onde começa e x2 é onde termina
            //x=horizontal
            //y=vertical

            //desenhar retangulos 
            //cor
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

            //modificar cor do desenho deve ser colocada antes do proprio desenho
        }
}