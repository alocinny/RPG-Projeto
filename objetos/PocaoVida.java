public class PocaoVida {

    private int pocaoVida = 0;

    public int pegouPocaoCura(){
        this.pocaoVida += 1;
        return this.pocaoVida;
    }

    public int usouPocaoCura(){
        this.pocaoVida -= 1;
        return this.pocaoVida;
    }

    public boolean temPocaoCura(){
        return this.pocaoVida > 0;
    }
}
