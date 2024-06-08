package Agentes;

public class Atirador extends Agentes{
    
    private static int[] habilidade = {15,6,2,2};
    private static int[] saude = {90,0};

    //construtor
    public Atirador(){
        super(habilidade, saude);
    }
}
