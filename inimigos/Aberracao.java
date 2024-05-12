package inimigos;

public class Aberracao {
	private int vida;
	private int danoJato;
	
	public Aberracao () {
		this.vida = 100;
		this.danoJato = 10;
	}
	
	public int ataque () {
		return danoJato;
	}
	
	
	public void LevarDano (int danoLevado) {
		vida -= danoLevado;
	}
	
	public boolean Vivo() {
		return vida > 0;
	}

	public int Vida(){
		return this.vida;
	}
	
}
