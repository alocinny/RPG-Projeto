package Criaturas;

public class Criaturas {
    
    private int[] habilidades; //{força, agilidade}
    private int vida;
    private int[] position; // x,y

    //construtor
    public Criaturas(int[] hability, int life, int[] position){
        this.habilidades = hability;
        this.vida = life;
        this.position = position;
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

    public int getX(){
        return position[0];
    }

    public int getY(){
        return position[1];
    }
}