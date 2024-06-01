package Objetos;

public class PocaoVida {
    private int pocaoVida;

    public PocaoVida(int x){
        this.pocaoVida = x;
    }

    public int pegouPocaoCura(){
        this.pocaoVida += 1;
        return this.pocaoVida;
    }

    public int usouPocaoCura(){
        this.pocaoVida -= 1;
        return this.pocaoVida;
    }

    public void incrementoVida(){

    }

    public boolean temPocaoCura(){
        return this.pocaoVida > 0;
    }
}