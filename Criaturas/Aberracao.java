package Criaturas;

public class Aberracao extends Criaturas{

    private static int[] habilidade = {6,4};
    private static int vida = 95;
    public static int[] position = {10,10};
    
    //construtor
    public Aberracao() {
        super(habilidade, vida, position);
    }
}
