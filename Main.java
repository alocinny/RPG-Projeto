//teste

import Agentes.OcultistaConhecimento;
import Criaturas.Marionete;
import Menu.MenuCombate;

public class Main {

    public static void main(String[] args) {
        
        OcultistaConhecimento ocultistaConhecimento = new OcultistaConhecimento();
        Marionete marionete = new Marionete();
        MenuCombate menuCombate = new MenuCombate();

        menuCombate.winCombate(ocultistaConhecimento, marionete);
    }
}