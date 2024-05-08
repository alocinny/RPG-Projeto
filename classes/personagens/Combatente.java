package personagens;

public class Combatente{
    private int vida;
    private int danoSoco;
    private int danoChute;

    public Atirador(){
        this.vida = 100;
        this danoSoco = 9;
        this danoChute = 12;
    }

    public int ataque(int escolha){
        switch(escolha){
            case 1:
                return danoSoco;
            case 2: 
                return danoChute;
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