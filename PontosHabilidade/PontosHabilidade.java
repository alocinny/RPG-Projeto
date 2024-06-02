/*
 * PROGRESSÃO DE NÍVEL SERÁ DADO A PARTIR DO USO DE PONTOS DE HABILIDADE PARA UPAR AGILIDADE (AUMENTAR DEFESA) OU AFINIDADE (DANO DO ATAQUE).
 * ponto de habilidade será adquirido ao pegar objetos amaldiçoados e matar criaturas (5 por objetos amaldiçoados e 1 por criaturas)
 */

package PontosHabilidade;

public class PontosHabilidade {

    private int pontosHabilidade;

    //CONSTRUTOR -------------------------------------

    public PontosHabilidade(int pontosHabilidade){
        this.pontosHabilidade = pontosHabilidade;
    }
    
    //GETTERS E SETTERS ------------------------------

    //set
    public void setGanhaPontosHabilidade(int pontoAdquirido){
        this.pontosHabilidade += pontoAdquirido;
    }

    public void setUsaPontoHabilidade(int pontoUsado){
        this.pontosHabilidade -= pontoUsado;
    }

    //get
    public int getPontosHabilidade(){
        return this.pontosHabilidade;
    }

}
