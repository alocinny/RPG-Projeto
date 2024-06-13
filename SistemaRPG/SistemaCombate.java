package SistemaRPG;

import Agentes.Agentes;
import Criaturas.Criaturas;

public class SistemaCombate extends Dados{
    
    private int ataque;
    private int defesa;

    //agente sempre começa o turno
    public void combate(Agentes agentes, Criaturas criaturas, AtaqueDefesa ataqueDefesa, Dados dados, int escolha) {

        switch (escolha) {
            //ritual de descarnar (ataque simples + 2d10)
            case 1:
                //AGENTE

                //define o valor do d10
                dados.setD10(2);
                //define o valor do d4
                dados.setD4(agentes.getForca());
                //define o valor do ataque simples do player
                ataqueDefesa.ataqueSimples(dados.getD4(), agentes);
                //define o valor do ataque total do player
                ataque = ataqueDefesa.getAtaqueSimples() + dados.getD10();

                //imprimindo informações na tela
                System.out.println("ocultista conjura ritual de descarnar, dando: " + ataque + " de dano");
                System.out.println("valores dos dados do ocultista");
                System.out.println("valor d4: " + dados.getD4() + " valor d10: " + dados.getD10());

                //resetando os dados
                dados.resetaD10();
                dados.resetaD4();

                //CRIATURA

                //define valor do d10
                dados.setD10(criaturas.getAgilidade());
                //define o valor da defesa
                ataqueDefesa.defesa(dados.getD10());
                //define valor total da defesa
                defesa = ataqueDefesa.getDefesa();
                //modifica a vida da criatura
                criaturas.newVidaDano(ataque, defesa);
                
                //imprimindo informações na tela
                System.out.println("criatura desvia do ataque, reduzindo em " + defesa + " o dano do ocultista");
                System.out.println("valores dos dados da criatura");
                System.out.println(" valor d10: " + dados.getD10());

                //resetando valores
                dados.resetaD10();
                dados.resetaD4();
                ataqueDefesa.resetaDefesa();
                ataqueDefesa.resetaAtaqueSimples();
                
                break;
            case 2: 
                //AGENTE

                //define o valor do d10
                dados.setD10(1);
                //define o valor do d4
                dados.setD4(agentes.getForca());
                //define o valor do ataque simples do player
                ataqueDefesa.ataqueSimples(dados.getD4(), agentes);
                //define o valor do ataque total do player
                ataque = ataqueDefesa.getAtaqueSimples() + dados.getD10() + dados.getD4();

                //imprimindo informações na tela
                System.out.println("ocultista conjura ritual de descarnar, dando: " + ataque + " de dano");
                System.out.println("valores dos dados do ocultista");
                System.out.println("valor d4: " + dados.getD4() + " valor d10: " + dados.getD10());

                //resetando os dados
                dados.resetaD10();
                dados.resetaD4();

               //CRIATURA

                //define valor do d10
                dados.setD10(criaturas.getAgilidade());
                //define o valor da defesa
                ataqueDefesa.defesa(dados.getD10());
                //define valor total da defesa
                defesa = ataqueDefesa.getDefesa();
                //modifica a vida da criatura
                criaturas.newVidaDano(ataque, defesa);

                //imprimindo informações na tela
                System.out.println("criatura desvia do ataque, reduzindo em " + defesa + " o dano do ocultista");
                System.out.println("valores dos dados da criatura");
                System.out.println(" valor d10: " + dados.getD10());

                //resetando valores
                dados.resetaD10();
                dados.resetaD4();
                ataqueDefesa.resetaDefesa();
                ataqueDefesa.resetaAtaqueSimples();

                break;
            case 3: 
                //AGENTE

                //define o valor do d10
                dados.setD10(3);
                //define o valor do d4
                dados.setD4(agentes.getForca());
                //define o valor do ataque simples do player
                ataqueDefesa.ataqueSimples(dados.getD4(), agentes);
                //define o valor do ataque total do player
                ataque = ataqueDefesa.getAtaqueSimples() + dados.getD10() + dados.getD4();

                //imprimindo informações na tela
                System.out.println("ocultista conjura ritual de descarnar, dando: " + ataque + " de dano");
                System.out.println("valores dos dados do ocultista");
                System.out.println("valor d4: " + dados.getD4() + " valor d10: " + dados.getD10());

                //resetando os dados
                dados.resetaD10();
                dados.resetaD4();

                //CRIATURA

                //define valor do d10
                dados.setD10(criaturas.getAgilidade());
                //define o valor da defesa
                ataqueDefesa.defesa(dados.getD10());
                //define valor total da defesa
                defesa = ataqueDefesa.getDefesa();
                //modifica a vida da criatura
                criaturas.newVidaDano(ataque, defesa);
                
                //imprimindo informações na tela
                System.out.println("criatura desvia do ataque, reduzindo em " + defesa + " o dano do ocultista");
                System.out.println("valores dos dados da criatura");
                System.out.println(" valor d10: " + dados.getD10());

                //resetando valores
                dados.resetaD10();
                dados.resetaD4();
                ataqueDefesa.resetaDefesa();
                ataqueDefesa.resetaAtaqueSimples();
            default:
                break;
        }

        System.out.println("\n\n");

        //definindo valor do d10
        dados.setD10(criaturas.getForca());
        //definindo valor do ataque
        ataqueDefesa.ataqueSimples(dados.getD10());
        //definindo valor do ataque total
        ataque = ataqueDefesa.getAtaqueSimples();

        //imprimindo valores
        System.out.println("a criatura ataca o ocultista, dando " + ataque + " de dano");
        System.out.println("valores dos dados da criatura");
        System.out.println("valor d10: " + dados.getD10());
        
        //resetando dados
        dados.resetaD10();

        //valor d4
        dados.setD4(agentes.getAgilidade());
        //definindo valor defesa ocultista
        ataqueDefesa.defesa(dados.getD4(), agentes);
        //definindo defesa total do ocultista
        defesa = ataqueDefesa.getDefesa();
        //modifica vida do agente
        agentes.newVida(ataque, defesa);

        System.out.println("o ocultista desvia do ataque, reduzindo em " + defesa + " o dano da criatura");
        System.out.println("valores dos dados do ocultista");
        System.out.println("valor d4: " + getD4());

        //resetando valores
        dados.resetaD10();
        dados.resetaD4();
        ataqueDefesa.resetaAtaqueSimples();
        ataqueDefesa.resetaDefesa();

        //imprimindo valores de vida
        System.out.println("vida ocultista: " + agentes.getVida());
        System.out.println("vida da criatura: " + criaturas.getVida());

        System.out.println("\n\n");
    }
}