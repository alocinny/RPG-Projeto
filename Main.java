import Menu.MenuInventario;
import SistemaRPG.*;
//teste inventario
public class Main {

    public static void main(String[] args) {

        MenuInventario menuInventario = new MenuInventario();
        Inventario inventario = new Inventario();
        Item ritualCura = new Item("ritual cura");
        Item cinzasDeAnimais = new Item("cinza de animais");
        Item cinzas = new Item("cinzas");
        Item chaves1 = new Item("chave");
        
        inventario.addItem(chaves1);
        inventario.addItem(cinzas);
        inventario.addItem(cinzasDeAnimais);
        inventario.addItem(ritualCura);

        if(inventario.temItem(ritualCura)){
            System.out.println("tem");
        } else {
            System.out.println("nao tem");
        }
        
        menuInventario.winMenuInventario(inventario);
    }
}