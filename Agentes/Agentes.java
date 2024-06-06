package Agentes;

public class Agentes {

    private int[] habilidade; //{afinidade, vigor, agilidade, constituicao}
    private int[] saude; //{vida, ritualCura}

    //construtor
    public Agentes(int[] hability, int[] health){
        this.habilidade = hability;
        this.saude = health;
    }

    //setters
    public void newAfinidade(){
        //atualiza o vigor quando progride o nivel - incrementa a habilidade com o valor do vigor
        habilidade[0]+=habilidade[1];
    }

    public void newAgilidade(){
        //atualiza a agilidade quando progride o nivel - incrementa a agilidade com o valor da constituicao
        habilidade[2]+=habilidade[3];
    }

    public void newVidaRitualCura(){
        //atualiza a vida quando usa o ritual de cura - incrementa a vida com o valor do ritual
        saude[0]+=saude[1];
    }

    public void newVidaDano(int danoLevado){
        //atualiza a vida quando o agente nao desvia do ataque - decrementa a vida com o valor do dano levado
        this.saude[0]-=danoLevado;
    }

    public void newVidaDesvio(int danoLevado){
        //atualiza a vida quando o agente desvia do ataque - decrementa a vida com o valor do dano levado - a agilidade
        this.saude[0]-=danoLevado-this.habilidade[2];
    }

    //getters
    public int getAfinidade(){
        //retorna o valor da afinidade - dano do agente
        return habilidade[0];
    }

    public int getAgilidade(){
        //retorna o valor da agilidade - defesa do agente (redução do dano da criatura)
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