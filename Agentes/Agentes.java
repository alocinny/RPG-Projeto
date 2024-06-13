package Agentes;

public class Agentes {

    private int[] habilidade; //{força, agilidade, vigor, atletismo, ptOcultismo}
    private int[] saude; //{vida, ritualCura}

    //construtor
    public Agentes(int[] hability, int[] health){
        this.habilidade = hability;
        this.saude = health;
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
}