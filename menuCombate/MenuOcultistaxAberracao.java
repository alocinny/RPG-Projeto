package menuCombate;
import java.util.Scanner;

import Agentes.*;
import Inimigos.*;
import objetos.*;

public class MenuOcultistaxAberracao {
    
    //teste sistema de combate - console
    public static void main (String[] args) {

        int[] saudeOcultista = {100, 2};
        int[] saudeAberracao = {100, 0};
        int[] habilidadesOcultista = {15, 5, 0, 5}; //afinidade, agilidade, sanidade, vigor
        int[] habilidadesAberracao = {10, 5, 0, 3};

        Ocultista ocultista = new Ocultista(saudeOcultista, habilidadesOcultista);
        Aberracao aberracao = new Aberracao(saudeAberracao, habilidadesAberracao);

        Scanner escolha = new Scanner(System.in);
        
        
        while(ocultista.Vivo() && aberracao.Vivo()){
            //imprimindo valores de vida 
            System.out.println("Ocultista: " + String.valueOf(ocultista.getVida()));
            System.out.println("Aberracao: " + String.valueOf(aberracao.getVida()));

            //seleção de escolha
            System.out.println("\nEscolha: \n1 - desviar \n2 - atacar");
            int decisao = escolha.nextInt();

            if(decisao == 1){

            }
        }
        escolha.close();
    }
}
