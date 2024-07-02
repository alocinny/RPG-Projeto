package Criaturas;

public class Marionete extends Criaturas {

    private static int[] habilidade = {5,6};
    private static int vida = 100;
    private static int[] position = {15,10};

    //construtor
    public Marionete() {
        super(habilidade, vida, position);
    }
}