package SistemaRPG;

import java.util.Map;
import java.util.HashMap;

public class Inventario {

    private Map<String, Integer> itens;
    int i=0;

    public Inventario(){
        itens = new HashMap<>();
    }

    public void addItem(Item item){
        itens.put(item.getNomeItem(), itens.getOrDefault(item.getNomeItem(), 0) + 1);
        i++;
        System.out.println(i);
    }
    
    public void removeItem(Item item){
        if(temItem(item)){
            int count = itens.get(item.getNomeItem());
            if(count > 1){
                itens.put(item.getNomeItem(), count-1);
                i--;
            } else {
                itens.remove(item.getNomeItem());
            }
        }
    }

    public int getI(){
        return i;
    }

    public boolean temItem(Item item){
        return itens.containsKey(item.getNomeItem());
    }

    public String getTemItem(Item item){
        if(temItem(item)){
            return item.getNomeItem();
        }
        return ". ";
    }

    public Map<String, Integer> getItens(){
        return itens;
    }
}