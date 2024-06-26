//teste

import java.util.Scanner;

import Agentes.Agentes;
import Agentes.OcultistaConhecimento;
import Agentes.OcultistaMedo;
import Agentes.OcultistaSangue;
import Mapa.Mapa;
import Menu.MenuJogo;
import SistemaRPG.ProgressaoNivel;

public class Main {

    private static int escolha;
    private static Agentes agente;

    public static void main(String[] args) {

        int[] habilidadeSangue = {3, 4, 6, 5, 5};
        int[] saudeSangue = {110, 0};

        int[] habilidadeMedo = {4, 3, 6, 5, 5};
        int[] saudeMedo = {100, 0};

        int[] habilidadeConhecimento = {5, 2, 8, 4, 5};
        int[] saudeConhecimento = {90, 0};

        // andar com w,a,s,d, pressionar 'e' para acessar o menul e 'p' para sair

        // mapa
        Mapa mapa = new Mapa(50, 30);

        // agentes
        OcultistaConhecimento ocultistaConhecimento = new OcultistaConhecimento(habilidadeConhecimento, saudeConhecimento);
        OcultistaMedo ocultistaMedo = new OcultistaMedo(habilidadeMedo, saudeMedo);
        OcultistaSangue ocultistaSangue = new OcultistaSangue(habilidadeSangue, saudeSangue);
        MenuJogo menuJogo = new MenuJogo();

        Scanner scanner = new Scanner(System.in);

        // menu temporário (depois vamos fazer GUI)

        System.out.println("ESCOLHA UM AGENTE");
        System.out.println("1 - Ocultista Conhecimento:\nagilidade: " + ocultistaConhecimento.getAgilidade() + "\nforça: " + ocultistaConhecimento.getForca() + "\nvigor: " + ocultistaConhecimento.getvigor() + "\natletismo: " + ocultistaConhecimento.getAtletismo() + "\n");
        System.out.println("2 - Ocultista Medo:\nagilidade: " + ocultistaMedo.getAgilidade() + "\nforça: " + ocultistaMedo.getForca() + "\nvigor: " + ocultistaMedo.getvigor() + "\natletismo: " + ocultistaMedo.getAtletismo() + "\n");
        System.out.println("3 - Ocultista Sangue:\nagilidade: " + ocultistaSangue.getAgilidade() + "\nforça: " + ocultistaSangue.getForca() + "\nvigor: " + ocultistaSangue.getvigor() + "\natletismo: " + ocultistaSangue.getAtletismo() + "\n");

        try {
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    agente = new Agentes(ocultistaConhecimento.getHabilidades(), ocultistaConhecimento.getSaude());
                    break;
                case 2:
                    agente = new Agentes(ocultistaMedo.getHabilidades(), ocultistaMedo.getSaude());
                    break;
                case 3:
                    agente = new Agentes(ocultistaSangue.getHabilidades(), ocultistaSangue.getSaude());
                    break;
                default:
                    throw new IllegalArgumentException("Escolha inválida. Por favor, escolha 1, 2 ou 3.");
            }

            ProgressaoNivel progressaoNivel = new ProgressaoNivel(agente.getPtOcultismo(), agente);

            System.out.println();

            mapa.setAgente(agente);

            while (agente.vivo()) {

                mapa.drawMapa();

                char direction = scanner.next().charAt(0);

                if (direction == 'p') {
                    scanner.close();
                    break;
                }

                if (direction == 'e') {
                    menuJogo.winMenuJogo(progressaoNivel, agente);
                }

                agente.move(direction, mapa, agente);
            }

            System.out.println("fim");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}