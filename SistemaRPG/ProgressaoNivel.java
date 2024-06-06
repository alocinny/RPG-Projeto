package SistemaRPG;

public class ProgressaoNivel {
    
    private int xp;

    //construtor
    public ProgressaoNivel(int xp){
        this.xp = xp;
    }

    //setters
    public void newXp(){
        //incrementa o valor do xp
        xp+=2;
    }

    //getters
    public int getXp(){
        //retorna o valor do xp
        return xp;
    }
}
