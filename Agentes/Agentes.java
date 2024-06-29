package Agentes;

import Mapa.Mapa;
import Mapa.MapaObjeto;
import SistemaRPG.Inventario;
import SistemaRPG.Item;

public class Agentes {

    private Inventario inventario = new Inventario();
    private Item item;

    private int[] habilidade; //{força, agilidade, vigor, atletismo, ptOcultismo}
    private int[] saude; //{vida, ritualCura}

    private int[] position = {0,0}; //x,y

    //construtor
    public Agentes(int[] hability, int[] health){
        this.habilidade = hability;
        this.saude = health;
    }

    //movimentação
    public void move(char direction, Mapa mapa){
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

        if(mapa.isValidPosition(newX, newY)){
            if(mapa.isPorta(newX, newY) == true){ //ERRO -> VERIFICAR SE POSSUI A CHAVE PARA ENTRAR
                System.out.println("voce precisa da chave para entrar nessa casa.");
            } else if (mapa.isCasa(newX, newY)){
                System.out.println("parede");
            } else {

                position[0] = newX;
                position[1] = newY;
                CheckOBJ(mapa);
            }
        }
    }

    private void CheckOBJ(Mapa mapa){
        MapaObjeto mapaObjeto = mapa.getObjectAt(position[0], position[1]);
        if(mapaObjeto != null){
            if(mapaObjeto.getCaracterOBJ() == 'K'){
                //COMBATE 
                System.out.println("voce encontrou um inimigo! digite 1 para lutar ou 2 para fugir");
            } else {
                item = new Item(mapaObjeto.getNomeObj());
                inventario.addItem(item);
                mapa.removeObjAt(position[0], position[1]);
                System.out.println("objeto: " + item.getNomeItem() + " coletado! ");
                System.out.println("objetos coletados: " + inventario.getItens());
            }
        }
    }

    public void getInventario(){
        System.out.println(inventario.getItens());
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