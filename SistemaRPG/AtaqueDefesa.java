package SistemaRPG;

import Agentes.Agentes;

public class AtaqueDefesa {

    private int ataqueSimples;
    private int defesa;

    // AGENTES ------------------------------------------------------------

    /*
     * | COMBATE | - agentes
     *
     * - rolagem de dados
     * - dados utilizados: d4 e d10
     * - x: força
     * - y: agilidade
     *
     *ataqueSimples = xd4 + vigor
     *defesa = yd4 + atletismo
     *
     *RitualDescarnar( gasta 4 pt ocultismo ) = ataqueSimples + 2d10 (+5 se *gastar 7 pontos de ocultismo)
     *
     *RitualInfligirDoença = ataqueSimples + 1d10 (+5 se gastar 5 pontos de *ocultismo)
     *
     *RitualDeDestruiçãotemporal = ataqueSimples + 1d10
     *
     *RitualDeBençãoMaldita = ataqueSimples + 3d4 (+5 se gastar 2 pontos de *ocultismo)
    */

    //entra o valor do dado e calcula o dano do ataque simples do agente
    public void ataqueSimples(int valorDado, Agentes agentes){

        ataqueSimples = valorDado + agentes.getvigor();
    }

    //entra o valor do dado e retorna o dano do ritual escolhido
    public int Ritual(int valorDado){

        return getAtaqueSimples() + valorDado;
    }

    //entra o valor do dado e calcula a defesa do agente 
    public void defesa(int valorDado, Agentes agentes){
        
        defesa = valorDado + agentes.getAgilidade();
    }

    //CRIATURAS ------------------------------------------------------

    /*
     * | COMBATE | - criaturas
     * - rolagem de dados
     * - dados utilizados: d10
     * - x: força
     * - y: agilidade
     * defesa = yd10/2
     * ataque = xd10 + 2
    */

    //entra o valor do dado e calcula dano da criatura
    public void ataqueSimples(int valorDado){

        ataqueSimples = (valorDado/2)+10;
    }

    public void defesa(int valorDado){

        defesa = valorDado/2;
    }

    //getters
    public int getAtaqueSimples(){

        return ataqueSimples;
    }

    public int getDefesa(){

        return defesa;
    }
    
    //setters
    public void resetaAtaqueSimples(){

        ataqueSimples = 0;
    }

    public void resetaDefesa(){

        defesa = 0;
    }
}
