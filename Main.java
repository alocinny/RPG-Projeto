//teste

import java.util.Scanner;

import Agentes.Agentes;
import Agentes.OcultistaConhecimento;
import Mapa.Mapa;

public class Main {

    public static void main(String[] args) {
        
        Mapa mapa = new Mapa(30,30);
        OcultistaConhecimento ocultistaConhecimento = new OcultistaConhecimento();
        Agentes agente = new Agentes(ocultistaConhecimento.getHabilidades(), ocultistaConhecimento.getSaude());
        
        mapa.setAgente(agente);
    
        Scanner scanner = new Scanner(System.in);
        
        while(true){

        mapa.drawMapa();
    
        char direction = scanner.next().charAt(0);

        if(direction == 'q'){
            break;
        }

        agente.move(direction,mapa);
        }
        
        scanner.close();
    }
}