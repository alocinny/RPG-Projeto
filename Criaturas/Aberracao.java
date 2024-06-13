package Criaturas;

public class Aberracao extends Criaturas{

    private static int[] habilidade = {3,4};
    private static int vida = 95;
    
    //construtor
    public Aberracao() {
        super(habilidade, vida);
    }
}
