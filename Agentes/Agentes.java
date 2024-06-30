package Agentes;

import java.util.Map;
import java.util.Scanner;

import Criaturas.Criaturas;
import Mapa.Mapa;
import Mapa.MapaObjeto;
import Mapa.MapaUtilities;
import Menu.MenuCombate;
import SistemaRPG.Inventario;
import SistemaRPG.Item;

public class Agentes {

    private Inventario inventario = new Inventario();
    private MapaUtilities mapaUtilities = new MapaUtilities();
    private Item item;
    private Scanner scanner = new Scanner(System.in);
    private int escolha;

    private int[] habilidade; //{força, agilidade, vigor, atletismo, ptOcultismo}
    private int[] saude; //{vida, ritualCura}

    private int[] position = {0,0}; //x,y

    //construtor
    public Agentes(int[] hability, int[] health){
        this.habilidade = hability;
        this.saude = health;
    }

    //movimentação
    public void move(char direction, Mapa mapa, Agentes agente){
        int newX = position[0];
        int newY = position[1];

        switch(direction){
            case 'w': 
                newY--;
            break;
            case 's': 
                newY++;
            break;
            case 'a': 
                newX--;
            break;
            case 'd': 
                newX++;
            break;
        }

        if(mapaUtilities.isValidPosition(mapa.getWidth(),mapa.getHeight(), newX, newY)){
            if(mapaUtilities.isPorta(mapa.getMap(), newX, newY)){ //ERRO -> VERIFICAR SE POSSUI A CHAVE PARA ENTRAR
                System.out.println("voce precisa da chave para entrar nessa casa.");
            } else if (mapaUtilities.isCasa(mapa.getMap(), newX, newY)){
                System.out.println("parede");
            } else {
                position[0] = newX;
                position[1] = newY;
                CheckOBJ(mapa);

                if(mapa.getCriatura(position[0], position[1])!=null){

                    Criaturas criatura = mapa.getCriatura(newX, newY);
    
                    if(position[0] == criatura.getX() && position[1] == criatura.getY() && criatura.vivo()){
                        System.out.println("voce encontrou uma criatura! digite 1 para lutar");
                        escolha = scanner.nextInt();
                        if(escolha == 1){
                            MenuCombate menuCombate = new MenuCombate();
                            menuCombate.winCombate(agente, criatura);
                            mapaUtilities.removeObjAt(mapa.getMap(), position[0], position[1]);
                        }
                    }
                }
            }
        }
    }

    private void CheckOBJ(Mapa mapa){
        MapaObjeto mapaObjeto = mapaUtilities.getObjAt(mapa.getMap(), position[0], position[1]);
        if(mapaObjeto != null){ 
            if(mapaObjeto.getCaracterOBJ() != 'C'){
                item = new Item(mapaObjeto.getNomeObj());
                inventario.addItem(item);
                mapaUtilities.removeObjAt(mapa.getMap(), position[0], position[1]);
                System.out.println("objeto: " + item.getNomeItem() + " coletado! ");
                System.out.println("objetos coletados: " + inventario.getItens());
            }
        }
    }

    public Map<String, Integer> getInventario(){
        return inventario.getItens();
    }

    //setters
    public void newForça(){
        //atualiza a força quando progride o nível
        //verifica se a força é menor ou igual a 10
        if(habilidade[0]<=10){
            habilidade[0]+=1;
        }
    }

    public void newAgilidade(){
        //atualiza a agilidade quando progride o nivel 
        //verifica se a agilidade é menor ou igual a 10
        if(habilidade[1]<=10){
            habilidade[1]+=1;
        }
    }

    public void newVidaRitualCura(){
        //atualiza a vida quando usa o ritual de cura - incrementa a vida com o valor do ritual
        saude[0]+=saude[1];
    }

    public void newVida(int danoLevado, int defesa){
        //atualiza vida após ataque da da criatura
        if(danoLevado-defesa>0){

            this.saude[0]-=danoLevado-defesa;
        }
    }

    //getters
    public int getForca(){
        return habilidade[0];
    }

    public int getAgilidade(){
        return habilidade[1];
    }

    public int getvigor(){
        return habilidade[2];
    }

    public int getAtletismo(){
        return habilidade[3];
    }

    public int getPtOcultismo(){
        return habilidade[4];
    }

    public int getVida(){
        //retorna o valor da vida
        if(saude[0]>=0){
            return saude[0];
        }
        return 0;
    }

    public boolean vivo(){
        //retorna true se a vida do agente for maior que 0
        return saude[0]>0;
    }
    
    public int[] getHabilidades(){
        return habilidade;
    }

    public int[] getSaude(){
        return saude;
    }

    public int getX(){
        return position[0];
    }

    public int getY(){
        return position[1];
    }
}