package Inimigos;

public class Vultos {
	private int vida;
	private int danoDash;
	
	public Vultos() {
		this.vida = 100;
		this.danoDash = 15;
		
	}
	
	public int ataque () {
		
		return danoDash;
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
