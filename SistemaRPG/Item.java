package SistemaRPG;

public class Item {

    private String nomeItem;

    public Item(String item){
        this.nomeItem = item;
    }

    public String getNomeItem(){
        return nomeItem;
    }

    public String toString(){
        return nomeItem;
    }
}
