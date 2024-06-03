package Agentes;
import Personagens.Personagens;

public class Ocultista extends Personagens{
    
    //CONSTRUTOR --------------------------------------
    public Ocultista(int[] saude, int[] habilidades){
        super(saude, habilidades);
    }

    @Override //sobrescrevendo o metodo ataque da classe pai Personagem na classe ocultista
    public int ataque(int defesa) {
        int danoBase = getAfinidade();
        int danoTotal = danoBase; 

        // O dano não pode ser negativo
        if (danoTotal < 0) {
            danoTotal = 0;
        }

        return danoTotal;
    }


    public int defender(int danoLevado){
		
        //dano recebido - a agilidade que reduz o dano do ataque
        //verificar se fica negativo
		if(danoLevado - getAgilidade() < 0){
            return 0;
        } else {
            return danoLevado - getAgilidade();
        }
	}
}
