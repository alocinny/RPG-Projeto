import java.util.Scanner;
import java.util.Random;

import Agentes.Agentes;
import Agentes.OcultistaConhecimento;
import Agentes.OcultistaMedo;
import Agentes.OcultistaSangue;
import Criaturas.Aberracao;
import Criaturas.Criaturas;
import Criaturas.Marionete;
import Criaturas.ZumbiDeSangue;
//import Menu.MenuCombate;
import SistemaRPG.Combate;

//teste combate
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha o agente: ");
        int idAgente = scanner.nextInt();

        int[] habilidadeAgente;
        int[] saudeAgente;
        int[] habilidadeCriatura;
        int saudeCriatura;

        OcultistaConhecimento ocultistaConhecimento = new OcultistaConhecimento();
        OcultistaSangue ocultistaSangue = new OcultistaSangue();
        OcultistaMedo ocultistaMedo = new OcultistaMedo();

        ZumbiDeSangue zumbiDeSangue = new ZumbiDeSangue();
        Marionete marionete = new Marionete();
        Aberracao aberracao = new Aberracao();

        switch (idAgente) {
            case 1:
                habilidadeAgente = ocultistaConhecimento.getHabilidades();
                saudeAgente = ocultistaConhecimento.getSaude();
                break;
            case 2: 
                habilidadeAgente = ocultistaSangue.getHabilidades();
                saudeAgente = ocultistaSangue.getSaude();
                break;
            case 3: 
                habilidadeAgente = ocultistaMedo.getHabilidades();
                saudeAgente = ocultistaMedo.getSaude();
                break;
            default:
                habilidadeAgente = null;
                saudeAgente = null;
                break;
        }

        Random random = new Random();

        int idCriatura = random.nextInt(3);

        switch (idCriatura) {
            case 0:
                System.out.println("zumbi de sangue");
                habilidadeCriatura = zumbiDeSangue.getHabilidades();
                saudeCriatura = zumbiDeSangue.getVida();
                break;
            case 1: 
                System.out.println("marionete");
                habilidadeCriatura = marionete.getHabilidades();
                saudeCriatura = marionete.getVida();
                break;
            case 2: 
                System.out.println("aberracao de sangue");
                habilidadeCriatura = aberracao.getHabilidades();
                saudeCriatura = aberracao.getVida();
                break;
            default:
                habilidadeCriatura = null;
                saudeCriatura = 0;
                break;
        }

        Agentes agente = new Agentes(habilidadeAgente, saudeAgente);
        Criaturas criatura = new Criaturas(habilidadeCriatura, saudeCriatura);

        //MenuCombate combate = new MenuCombate();
        
        //combate.winCombate(agente, criatura);

        Combate combate = new Combate();

        while(agente.vivo() && criatura.vivo()){
            
            System.out.println("\n\n");
            System.out.println("escolha um ritual para atacar - 1, 2, 3 ou 4: ");
            int escolha = scanner.nextInt();
            System.out.println("\n\n");

            combate.combate(agente, criatura,escolha);
        }

        scanner.close();
    }
}