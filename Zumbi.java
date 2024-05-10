package Inimigos;

public class Zumbi {
	private int vida;
	private int danoChoque;
	
	public Zumbi () {
		this.vida = 100;
		this.danoChoque = 15;
		
	}
	
	public int ataque () {
		
		return danoChoque;
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
