package SistemaRPG;

import Agentes.Agentes;

public class ProgressaoNivel extends Agentes{
    
    private int xp;

    //construtor
    public ProgressaoNivel(int xp, int[] hability, int[] healty){
        super(hability, healty);
        this.xp = xp;
    }

    //setters
    public void newXpIncrementa(){
        //incrementa o valor do xp
        xp+=2;
    }

    public void newXpDecrementaforca(){
        //decrementa o valor para progredir afinidade
        xp-=3;
        newForça();
    }

    public void newXpDecrementaAgilidade(){
        //decrementa o valor para progredir agilidade
        xp-=2;
        newAgilidade();
    }

    //getters
    public int getXp(){
        //retorna o valor do xp
        return xp;
    }
}