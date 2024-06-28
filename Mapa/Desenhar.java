package Mapa;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

// criando desenhos com o java swing 
// metodo paint

// classe herdando de jframe
    public class Desenhar extends JFrame {
        //construtor da classe
        public Desenhar() {
            
            //metodos de configuracao de uma janela
            setSize(1200,900);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            
        }

        //sobrescrita do metodo paint
        public void paint(Graphics g){
            //g é um objeto
            g.drawLine(100,100,500,500);
            //x1 é onde começa e x2 é onde termina
            //x=horizontal
            //y=vertical

            //desenhar retangulos 
            g.drawRect(400, 100, 300, 300);
            //desenhar formas ovais
            g.drawOval(420, 120, 260, 260);
            //metodos de preencher
            g.fillRect(700, 450, 400, 400);
            //modificar cor do desenho
            //deve ser colocada antes do proprio desenho
            g.setColor(Color.green);
            g.fillOval(720, 470, 360, 360);
            //apagar desenhos
            g.clearRect(200, 200, 600, 600);

        }

        public static void main(String[]args){
            //instanciando classe
            new Desenhar();
        }



    }





