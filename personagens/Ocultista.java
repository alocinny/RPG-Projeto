package personagens;

public class Ocultista {
    private int vida;
    private int danoCineraria;
    private int danoInfligirDoenca;

    public Ocultista(){
        this.vida = 80;
        this.danoCineraria = 20;
        this.danoInfligirDoenca = 15;
    }

    public int ataque1(){
        return danoCineraria;
    }

    public int ataque2(){
        return danoInfligirDoenca;
    }

    public void LevarDano(int danoLevado){
        vida -= danoLevado;
    }

    public boolean Vivo(){
        return vida > 0;
    }

    public int Vida(){
        return this.vida;
    }
}
