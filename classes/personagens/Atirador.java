package personagens;

public class Atirador{
    private int vida;
    private int danoProjetil;
    private int danoMolotov;

    public Atirador(){
        this.vida = 80;
        this danoProjetil = 10;
        this danoMolotov = 15;
    }

    public int ataque(int escolha){
        switch(escolha){
            case 1:
                return danoProjetil;
            case 2: 
                return danoMolotov;
            default:
                return 0;
        }
    }

    public void LevarDano(int danoLevado){
        vida -= danoLevado;
    }

    public boolean Vivo(){
        return vida > 0;
    }
}