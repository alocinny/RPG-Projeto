package personagens;

public class Ocultista {
    private int vida;
    private int danoCineraria;
    private int danoInfligirDoença;

    public Atirador(){
        this.vida = 80;
        this danoCineraria = 10;
        this danoInfligirDoença = 15;
    }

    public int ataque(int escolha){
        switch(escolha){
            case 1:
                return danoCineraria;
            case 2: 
                return danoInfligirDoença;
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
