
public class Combatente {
	private int vida = 100;
	private int saude = 0;
	private int forca = 2;
	private int soco = 2;
	private int chute = 3;
	
	public int setVida(int dano) {
		if(dano < this.vida) {
			this.vida = this.vida - dano;	
		} else {
			//inserir o que acontece quando vida = 0; 
		}
		return this.vida;
	}
	
	//aumento da saude com pocao de vida
	public int setSaude(int saude) {
		this.vida = this.vida + saude;
		return this.saude;
	}
	
	////aprimorar forca com pontos de habilidade
	public int setForca(int forca){
		this.forca = forca;
		return this.forca;
	}
	
	// mudanca do valor do dano do soco com pontos de habilidade
	public int setSoco(int soco){
		this.soco = soco * this.forca;
		return this.soco;
	}
	
	//mudanca do valor do dano do chute com pontos de habilidade
	public int setChute(int chute) {
		this.chute = chute * this.forca;
		return this.chute;
	}
}