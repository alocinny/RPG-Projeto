package SistemaRPG;

import java.util.List;
import java.util.ArrayList;

public class Inventario {

    private List<Item> itens;

    public Inventario(){
        itens = new ArrayList<>();
    }

    public void addItem(Item item){
        itens.add(item);
    }
    
    public void removeItem(Item item){
        itens.remove(item);
    }

    public boolean temItem(Item item){
        return itens.contains(item);
    }

    public List<Item> getItens(){
        return itens;
    }
}