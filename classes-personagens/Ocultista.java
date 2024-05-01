public class Ocultista {
	private int vida = 100;
	private int saude = 0;
	private int forca = 1;
	private int cineraria = 2;
	private int infligirDoenca = 3;
	
	public int setVida(int dano) {
		if(dano < this.vida) {
			this.vida = this.vida - dano;	
		} else {
			//inserir o que acontece quando vida = 0; 
		}
		return this.vida;
	}
	
	public int setSaude(int saude) {
		this.vida = this.vida + saude;
		return this.saude;
	}
	
	//aprimorar forca com pontos de habilidade
	public int setForca(int forca){
		this.forca = forca;
		return this.forca;
	}
	
	//mudanca do valor do dano da cineraria com pontos de habilidade
	public int setCineraria(int cineraria){
		this.cineraria = cineraria * this.forca;
		return this.cineraria;
	}
	
	//mudanca do valor do dano de infligir doenca com pontos de habilidade
	public int setInfligirdoenca(int infligirDoenca) {
		this.infligirDoenca = infligirDoenca * this.forca;
		return this.infligirDoenca;
	}
}
