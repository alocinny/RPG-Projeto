package Criaturas;

public class ZumbiDeSangue extends Criaturas{

    private static int[] habilidade = {3,4};
    private static int vida = 95;
    private static int[] position = {16,18};
    
    //construtor
    public ZumbiDeSangue() {
        super(habilidade, vida, position);
    }
}
