package Criaturas;

public class Marionete extends Criaturas {

    private static int[] habilidade = {8, 6};
    private static int vida = 100;

    //construtor
    public Marionete() {
        super(habilidade, vida);
    }
}