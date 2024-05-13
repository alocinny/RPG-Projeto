package personagens;

public class Combatente{
    private int vida;
    private int danoSoco;
    private int danoChute;

    public Combatente(){
        this.vida = 100;
        this.danoSoco = 10;
        this.danoChute = 15;
    }

    public int ataque1(){
        return danoSoco;
    }

    public int ataque2(){
        return danoChute;
    }

    public void LevarDano(int danoLevado){
        vida -= danoLevado;
    }

    public boolean Vivo(){
        return vida > 0;
    }

    public int Pocao() {
        return vida+= 15; 
     }

    public int Vida(){
		return this.vida;
	}
}