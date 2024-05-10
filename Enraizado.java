package Inimigos;

public class Enraizado {
	private int vida;
	private int danoLodo;
	
	public Enraizado() {
		this.vida = 100;
		this.danoLodo = 15;
		
	}
	
	public int ataque () {
		
		return danoLodo;
	}
	
	
	public void LevarDano (int danoLevado) {
		vida -= danoLevado;
	}
	
	public boolean Vivo() {
		return vida > 0;
		
	}
	
	public boolean Morto() {
		return vida < 0;
		
	}
	
}
