package personagens;

public class Atirador {
    private int vida;
    private int danoProjetil;
    private int danoMolotov;

    public Atirador(){
        this.vida = 90;
        this.danoProjetil = 15;
        this.danoMolotov = 10;
    }

    public int ataque1(){
        return danoProjetil;
    }

    public int ataque2(){
        return danoMolotov;
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