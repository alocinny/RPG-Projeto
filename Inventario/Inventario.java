package Inventario;

public class Inventario {
    //inventario - por enquanto trabalhando com um tamanho fixo
    private int[] inventario = new int[3];

    //CONSTRUTOR ----------------------------------------------------------
    public Inventario(int chaves, int objAmaldicoados, int pocaoVida){
        this.inventario[0] = chaves;
        this.inventario[1] = objAmaldicoados;
        this.inventario[2] = pocaoVida;
    }

    //GETTERS E SETTERS ----------------------------------------------------
    
    //setters
    public void setPegaChaves(){
        this.inventario[0]+=1;
    }

    public void setUsaChaves(){
        this.inventario[0]-=1;
    }

    public void setPegaObjAmaldicoados(){
        this.inventario[1]+=1;
    }

    public void setUsaObjAmaldicoados(){
        this.inventario[1]-=1;
    }

    public void setPegaPocaoVida(){
        this.inventario[2]+=1;
    }

    public void setUsaPocaoVida(){
        this.inventario[2]+=1;
    }

    //getters
    public int getChaves(){
        return this.inventario[0];
    }

    public int getObjAmaldicoados(){
        return this.inventario[1];
    }

    public int getPocaoVida(){
        return this.inventario[2];
    }
}