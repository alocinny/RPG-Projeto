package SistemaPRG;

public class Inventario {

    private int[] inventario = new int[3]; // {ritualDeCura, chaves, objetosAmaldicoados}

    public Inventario(int[] itens){
        this.inventario = itens;
    }

    //setters
    public void newRitualCura(){
        //incrementa a quantidade de ritual de cura
        inventario[0]+=1;
    }

    public void newChave(){
        //incrementa a quantidade de chaves que o player tem
        inventario[1]+=1;
    }
    
    public void newObjAmaldicoado(){
        //incrementa a quantidade de objetos amaldicoados que o player tem
        inventario[2]+=1;
    }

    //getters
    public int getRitualCura(){
        //retorna a quantidade de ritual de cura que o player tem
        return inventario[0];
    }

    public int getChave(){
        //retorna a quantidade de chaves que o player tem
        return inventario[1];
    }

    public int getObjAmaldicoado(){
        //retorna a quantidade de objetos amaldiçoados que o player tem
        return inventario[2];
    }
}
