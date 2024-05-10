package Inimigos;

public class Existidos {
	private int vida;
	private int danoLuz;
	
	public Existidos() {
		this.vida = 100;
		this.danoLuz = 15;
		
	}
	
	public int ataque () {
		
		return danoLuz;
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
