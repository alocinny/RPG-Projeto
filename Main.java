import Agentes.*;
import Inimigos.*;

public class Main {
       private static int[] saudeOcultista = {100, 2};
       private static int[] saudeAberracao = {100, 0};
       private static int[] habilidadesOcultista = {15, 5, 0, 5}; //afinidade, agilidade, sanidade, vigor
       private static int[] habilidadesAberracao = {10, 5, 0, 3};



    public static void main(String[] args){
        Ocultista ocultista = new Ocultista(saudeOcultista, habilidadesOcultista);
        Aberracao aberracao = new Aberracao(saudeAberracao, habilidadesAberracao);

        batalha(ocultista, aberracao);
        
    }
    
    public static void batalha(Ocultista ocultista, Aberracao aberracao){
        
    }
}