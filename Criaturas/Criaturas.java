package Criaturas;

public class Criaturas {
    private int[] habilidade; //afinidade, agilidade
    private int vida;

    //construtor
    public Criaturas(int[] hability, int life){
        this.habilidade = hability;
        this.vida = life;
    }

    //setters
    public void newVidaDano(int danoLevado, int random){
        //atualiza a vida quando a criatura leva o dano do agente
        switch(random){
            case 0:
                //caso a criatura decida atacar - decremenda o dano do ataque do agente
                this.vida-=danoLevado;
                break;
            case 1: 
            //caso a criatura decida atacar - decremenda o dano do ataque do agente - agilidade da criatura
                this.vida-=danoLevado-this.habilidade[1];
                break;
            default:
                break;
        }
    }
    
    //getters
    public int getVida(){
        //retorna o valor da vida
        return vida;
    }

    public int getAfinidade(){
        //retorna o dano da criatura
        return habilidade[0];
    }

    public boolean vivo(){
        //retorna true se a vida for maior que 0
        return vida > 0;
    }
}
