package Inimigos;

public class Marionete {
	private int vida;
	private int danoAtaque;
	
	public Marionete() {
		this.vida = 100;
		this.danoAtaque = 15;
		
	}
	
	public int ataque () {
		
		return danoAtaque;
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
