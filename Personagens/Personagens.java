package Personagens;

public class Personagens {
    //ATRIBUTOS ---------------------------------------------

    /*
     * afinidade - dano do ataque
     * agilidade - reduz dano do ataque (desviar)
     * sanidade - reduz a cada uso de ritual - definir se vamos
     * utilizar ou não
     * vigor - incrementa o dano do ataque
    */
    private int[] habilidades = new int[4]; 

    /*
     * vida - vida personagem
     * pocao vida - aumenta a vida, item espalhado pelo mapa
    */
    private int[] saude = new int[2]; //vida e pocaoVida

    //CONSTRUTOR --------------------------------------------

    //inicializando os atributos
    public Personagens(int[] saude, int[] habilidades){
        this.habilidades = habilidades;
        this.saude = saude;
    }

    //GETTERS E SETTERS -------------------------------------

    //setters
    public void setVida(int Vida){
        this.saude[0] = Vida;
    }

    public void setPocaoVida(int pocaoVida){
        this.saude[1] = pocaoVida;
    }

    public void setForca(int afinidade){
        this.habilidades[0] = afinidade;
    }

    public void setDefesa(int agilidade){
        this.habilidades[1] = agilidade;
    }

    public void setInteligencia(int investigacao){
        this.habilidades[2] = investigacao;
    }

    public void setAgilidade(int sanidade){
        this.habilidades[3] = sanidade;
    }

    //getters 
    public int getVida(){
        return this.saude[0];
    }

    public int getPocaoVida(){
        return this.saude[1];
    }

    public int getAfinidade(){
        return this.habilidades[0];
    }

    public int getAgilidade(){
        return this.habilidades[1];
    }

    public int getSanidade(){
        return this.habilidades[2];
    }

    public int getVigor(){
        return this.habilidades[3];
    }

    //MÉTODOS -------------------------------------------

    //ataque - força do personagem que está atacando - defesa do personagem que esta defendendo
    public int ataque(int defesa){
        return getAfinidade() - defesa;
    }

    public int dano(int vida, int danoLevado){
        //verificando se a vida ficará negativa com o dano
        if(vida - danoLevado >= 0){
            return vida - danoLevado;
        }
        return 0;
    }

    public boolean Vivo(){
        return this.saude[0] > 0;
    }
}
