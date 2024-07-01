package SistemaRPG;

import java.util.Random;

import Agentes.Agentes;
import Criaturas.Criaturas;

public class Combate {
    
    //DADOS ---------------------------------------
    private int[] d4;
    private int[] d10;
    private int sum;
    private Random random = new Random();
    private ProgressaoNivel progressaoNivel;
    
    //setters
    public void setD4(int numDados){

        d4 = new int[numDados];
        for(int i=0; i<numDados;i++){
            d4[i] = random.nextInt(4) + 1;
        }
    }  

    public void setSoma(int[] dado){
        sum = 0;
        for(int i = 0; i<dado.length;i++){
            sum+=dado[i];
        }
    }

    public void setD10(int numDados){

        d10 = new int[numDados];
        for(int i=0; i<numDados;i++){
            d10[i] = random.nextInt(10) + 1;
        }
    }  

    //getters
    public int[] getD4(){
        return d4;
    }

    public int[] getD10(){
        return d10;
    }

    public int getSumDado(){
        return sum;
    }

    //ATAQUE ---------------------------------
    private int ataqueSimples;
    private int ritual;
    private int defesa;

    //setters
    public void ataqueSimples(Agentes agente){
        
        setD4(agente.getForca());
        setSoma(d4);

        ataqueSimples = agente.getvigor() + getSumDado();
    }

    public void ataqueSimples(Criaturas criatura){

        setD10(criatura.getForca());
        setSoma(d10);
        ataqueSimples = getSumDado() + 5;
    }

    public void ritualDescarnar(){

        setD10(1);
        setSoma(d10);
        ritual = getAtaqueSimples() + getSumDado();
    }

    public void ritualInfligirDoença(){

        setD10(2);
        setSoma(d10);
        ritual = getAtaqueSimples() + getSumDado();
    }
    public void ritualDestruicaoTemporal(){

        setD10(3);
        setSoma(d10);
        ritual = getAtaqueSimples() + getSumDado();
    }

    public void ritualDeBençãoMaldita(){

        setD10(4);
        setSoma(d10);
        ritual = getAtaqueSimples() + (getSumDado()/2) + 10;
    }

    //getters
    public int getAtaqueSimples(){
        return ataqueSimples;
    }

    public int getRitual(){
        return ritual;
    }

    //DEFESA -----------------------------------------------
    //setters
    public void setdefesa(Agentes agente){

        setD4(agente.getAgilidade());
        setSoma(d4);
        defesa = getSumDado() + agente.getAtletismo();
    }

    public void setDefesa(Criaturas criatura){

        setD10(criatura.getAgilidade());
        setSoma(d10);
        defesa = getSumDado()/2;
    }

    //getters
    public int getDefesa(){
        return defesa;
    }

    public void combate(Agentes agente, Criaturas criatura, int escolha){
        if(agente.vivo()){

            switch (escolha) {
                 
                case 1:
                    ataqueSimples(agente);
    
                    System.out.println("ocultista conjura um ritual simples, dando: " + getAtaqueSimples() + " de dano");
    
                    setDefesa(criatura);
                    criatura.newVidaDano(getAtaqueSimples(), getDefesa());
    
                    System.out.println("criatura desvia do ataque, reduzindo em " + getDefesa() + " o dano do ocultista");
    
                    break;
                case 2:
    
                    ataqueSimples(agente);
                    ritualDescarnar();
    
                    System.out.println("ocultista conjura o ritual de descarnar, dando: " + (getAtaqueSimples()+getRitual()) + " de dano");
    
                    setDefesa(criatura);
                    criatura.newVidaDano((getAtaqueSimples()+getRitual()), getDefesa());
    
                    System.out.println("criatura desvia do ataque, reduzindo em " + getDefesa() + " o dano do ocultista");
    
                    break;
                case 3:
    
                    ataqueSimples(agente);
                    ritualInfligirDoença();
    
                    System.out.println("ocultista conjura o ritual de descarnar, dando: " + (getAtaqueSimples()+getRitual()) + " de dano");
    
                    setDefesa(criatura);
                    criatura.newVidaDano((getAtaqueSimples()+getRitual()), getDefesa());
    
                    System.out.println("criatura desvia do ataque, reduzindo em " + getDefesa() + " o dano do ocultista");
    
                    break;
                case 4:
                    ataqueSimples(agente);
                    ritualDestruicaoTemporal();
    
                    System.out.println("ocultista conjura o ritual de descarnar, dando: " + (getAtaqueSimples()+getRitual()) + " de dano");
    
                    setDefesa(criatura);
                    criatura.newVidaDano((getAtaqueSimples()+getRitual()), getDefesa());
    
                    System.out.println("criatura desvia do ataque, reduzindo em " + getDefesa() + " o dano do ocultista");
                
                    break;
                case 5: 
                    ataqueSimples(agente);
                    ritualDeBençãoMaldita();
    
                    System.out.println("ocultista conjura o ritual de descarnar, dando: " + (getAtaqueSimples()+getRitual()) + " de dano");
    
                    setDefesa(criatura);
                    criatura.newVidaDano((getAtaqueSimples()+getRitual()), getDefesa());
    
                    System.out.println("criatura desvia do ataque, reduzindo em " + getDefesa() + " o dano do ocultista");
    
                    break;
                default:
                    break;
            }
        }

        if(criatura.vivo()){
            
            System.out.println("\n\n");
    
            ataqueSimples(criatura);
    
            System.out.println("a criatura ataca o ocultista, dando " + getAtaqueSimples() + " de dano");
    
            setdefesa(agente);
            agente.newVida(getAtaqueSimples(), getDefesa());
    
            System.out.println("o ocultista desvia do ataque, reduzindo em " + getDefesa() + " o dano da criatura");
        }

        if(!criatura.vivo()){
            System.out.println("voce matou a criatura! ganhos: 2 pontos de ocultismo");
            progressaoNivel = new ProgressaoNivel(agente.getPtOcultismo(), agente);
            progressaoNivel.newXpIncrementa();
        }
        if(!agente.vivo()){
            System.out.println("a criatura matou voce!");
        }

        System.out.println("vida ocultista: " + agente.getVida());
        System.out.println("vida da criatura: " + criatura.getVida());

    }
}