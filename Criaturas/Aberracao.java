package Criaturas;

public class Aberracao extends Criaturas{

    private static int[] habilidade = {15,5};
    private static int vida = 80;
    
    //construtor
    public Aberracao() {
        super(habilidade, vida);
    }
}
