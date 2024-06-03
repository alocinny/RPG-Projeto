import Agentes.*;
import Inimigos.*;
import InterfaceMenu.*;
import Personagens.Personagens;

public class Main {
    private static int[] saudeOcultista = {100, 2};
    private static int[] saudeAberracao = {100, 0};
    private static int[] habilidadesOcultista = {15, 5, 0, 5}; //afinidade, agilidade, sanidade, vigor
    private static int[] habilidadesAberracao = {10, 5, 0, 3};

    public static void main(String[] args) {
        Ocultista ocultista = new Ocultista(saudeOcultista, habilidadesOcultista);
        Aberracao aberracao = new Aberracao(saudeAberracao, habilidadesAberracao);
        
        MenuCombate menuCombate = new MenuCombate(ocultista, aberracao);
        menuCombate.setVisible(true);
    }
}
