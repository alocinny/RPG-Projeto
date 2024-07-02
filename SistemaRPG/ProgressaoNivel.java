package SistemaRPG;

import Agentes.Agentes;

public class ProgressaoNivel {
    
    private int ptOcultismo;
    private Agentes agente;

    //construtor
    public ProgressaoNivel(int ptOcultismo, Agentes agente){
        this.ptOcultismo = ptOcultismo;
        this.agente = agente;
    }

    //setters
    public void newXpIncrementa(){
        //incrementa o valor do xp
        ptOcultismo+=2;
        agente.newPtOcultismo(ptOcultismo);
    }

    public void newXpDecrementaforca(){
        //decrementa o valor para progredir afinidade
        if(agente.getPtOcultismo()>=3){
            ptOcultismo-=3;
            agente.newPtOcultismo(ptOcultismo);
            agente.newForça();
        }
    }

    public void newXpDecrementaAgilidade(){
        //decrementa o valor para progredir agilidade
        if(agente.getPtOcultismo()>=2){
            ptOcultismo-=2;
            agente.newPtOcultismo(ptOcultismo);
            agente.newAgilidade();
        }
    }
}