
public class Atirador {
	private int vida = 100;
	private int saude = 0;
	private int forca = 1;
	private int bala = 3;
	private int molotov = 4;
	
	public int setVida(int dano) {
		if(dano < this.vida) {
			this.vida = this.vida - dano;	
		} else {
			//inserir o que acontece quando vida = 0; 
		}
		return this.vida;
	}
	
	// aumento da saude com pocao de vida
	public int setSaude(int saude) {
		this.vida = this.vida + saude;
		return this.saude;
	}
	
	//aprimorar forca com pontos de habilidade
	public int setForca(int forca){
		this.forca = forca;
		return this.forca;
	}
	
	//mudanca do valor do dano da bala com pontos de habilidade
		public int setBala(int bala){
			this.bala = bala * this.forca;
			return this.bala;
		}
		
	//mudanca do valor do dano do molotov com pontos de habilidade
	public int setMolotov(int molotov) {
		this.molotov = molotov * this.forca;
		return this.molotov;
	}
}
