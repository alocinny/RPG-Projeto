//teste

import java.util.Scanner;

import Agentes.Agentes;
import Agentes.OcultistaConhecimento;
import Agentes.OcultistaMedo;
import Agentes.OcultistaSangue;
import Mapa.Mapa;
import Menu.MenuInventario;
import SistemaRPG.Inventario;

public class Main {

    private static int escolha;
    private static Agentes agente;

    public static void main(String[] args) {

        //andar com w,a,s,d, pressionar 'e' para acessar inventário e 'q' para sair

        //mapa
        Mapa mapa = new Mapa(50,30);

        //agentes
        OcultistaConhecimento ocultistaConhecimento = new OcultistaConhecimento();
        OcultistaMedo ocultistaMedo = new OcultistaMedo();
        OcultistaSangue ocultistaSangue = new OcultistaSangue();
        MenuInventario menuInventario = new MenuInventario();
        Inventario inventario = new Inventario();
        
        Scanner scanner = new Scanner(System.in);
        
        //menu temporário (deepois vamos fazer GUI)
    
        System.out.println("ESCOLHA UM AGENTE");
        System.out.println("1 - Ocultista Conhecimento:\nagilidade: " + ocultistaConhecimento.getAgilidade() + "\nforça: " + ocultistaConhecimento.getForca() + "\nvigor: " + ocultistaConhecimento.getvigor() + "\natletismo: " + ocultistaConhecimento.getAtletismo() + "\n");
        System.out.println("2 - Ocultista Medo:\nagilidade: " + ocultistaMedo.getAgilidade() + "\nforça: " + ocultistaMedo.getForca() + "\nvigor: " + ocultistaMedo.getvigor() + "\natletismo: " + ocultistaMedo.getAtletismo() + "\n");
        System.out.println("3 - Ocultista Sangue:\nagilidade: " + ocultistaSangue.getAgilidade() + "\nforça: " + ocultistaSangue.getForca() + "\nvigor: " + ocultistaSangue.getvigor() + "\natletismo: " + ocultistaSangue.getAtletismo() + "\n");

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
                break;
        }
        
        System.out.println();
        
        mapa.setAgente(agente);
        
        while(agente.vivo()){

            mapa.drawMapa();
        
            char direction = scanner.next().charAt(0);

            if(direction == 'q'){
                scanner.close();
                break;
            } 

            if(direction == 'e'){
                menuInventario.winMenuInventario(inventario, agente);
            }

            agente.move(direction,mapa, agente);
        }

        System.out.println("fim");
    }
}