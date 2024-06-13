package SistemaRPG;

import java.util.Random;

public class Dados {

    private int d4=1;
    private int d10=1;
    private Random random = new Random();

    //setters
    public void setD4(int numDados){

        for(int i=0;i<numDados;i++){
            d4 += random.nextInt(4);
        }
    }

    public void resetaD4(){
        d4 = 1;
    }

    public void setD10(int numDados){

        for(int i=0; i<numDados; i++){
            d10 += random.nextInt(10);
        }
    }

    public void resetaD10(){
        d10 = 1;
    }

    //getters
    public int getD4(){
        return d4;
    }

    public int getD10(){
        return d10;
    }
}
