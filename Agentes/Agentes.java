package Agentes;

public class Agentes {
    protected int[] habilidade; //{afinidade, vigor, agilidade, constituicao}
    protected int[] saude; //{vida, ritualCura}

    //construtor
    public Agentes(int[] hability, int[] health){
        this.habilidade = hability;
        this.saude = health;
    }

    //setters
    public void newAfinidade(){
        //quando progride o nivel incrementa a habilidade com o valor do vigor
        habilidade[0]+=habilidade[1];
    }

    public void newAgilidade(){
        //quando progride o nivel incrementa a agilidade com o valor da constituicao
        habilidade[2]+=habilidade[3];
    }

    public void newVida(){
        //quando usa o ritual de cura incrementa a vida com o valor do ritual
        saude[0]+=saude[1];
    }

    //getters
    public int getAfinidade(){
        //retorna o valor da afinidade
        return habilidade[0];
    }

    public int getAgilidade(){
        //retorna o valor da agilidade
        return habilidade[2];
    }

    public int getVida(){
        //retorna o valor da vida
        return saude[0];
    }

    public boolean vivo(){
        //retorna true se a vida do agente for maior que 0
        return saude[0]>0;
    }
}
