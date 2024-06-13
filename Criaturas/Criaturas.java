package Criaturas;

public class Criaturas {
    
    private int[] habilidades; //{força, agilidade}
    private int vida;

    //construtor
    public Criaturas(int[] hability, int life){
        this.habilidades = hability;
        this.vida = life;
    }

    //setters
    public void newVidaDano(int danoLevado, int defesa){

        if(danoLevado-defesa>0){

            vida-=(danoLevado-defesa);
        }
    }
    
    //getters
    public int getVida(){
        //retorna o valor da vida
        if(vida>=0){
            return vida;
        }
        return 0;
    }

    public int getForca(){
        return habilidades[0];
    }

    public int getAgilidade(){
        return habilidades[1];
    }

    public boolean vivo(){
        //retorna true se a vida for maior que 0
        return vida > 0;
    }

    public int[] getHabilidades(){
        return habilidades;
    }
}