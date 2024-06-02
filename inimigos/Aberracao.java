package Inimigos;
import Personagens.Personagens;

public class Aberracao extends Personagens{

	//CONSTRUTOR --------------------------------------
	public Aberracao(int[] saude, int[] habilidades) {
		super(saude, habilidades);
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