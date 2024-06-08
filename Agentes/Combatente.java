package Agentes;

public class Combatente extends Agentes{
    
    protected static int[] habilidade = {10,5,4,2};
    protected static int[] saude = {110,0};

    //construtor
    public Combatente(){
        super(habilidade, saude);
    }
}
