package MenuCombate;
import java.util.Scanner;
import inimigos.Aberracao;
//import objetos.PocaoVida; nao deu certo
import personagens.Ocultista;



public class MenuOcultistaxAberracao {

    public static void main (String[] args) {

        Ocultista ocultista = new Ocultista ();
        Aberracao aberracao = new Aberracao ();
        Scanner escolhaAtaque = new Scanner(System.in);
        
        
        System.out.println("Escolha: \n1-fugir \n2-lutar");
        int decisaoLutar = escolhaAtaque.nextInt();

        int ataqueInimigo = aberracao.ataque();

        if (decisaoLutar == 2){
        while(ocultista.Vivo()&& aberracao.Vivo()){

            System.out.print("Escolha: \nAtaque 1- Cineraria\nAtaque 2- Infligir Doenca\nCura   3- Usar pocao \nEscapar  4- Nao lutar");
            int decisao = escolhaAtaque.nextInt();

            if (decisao == 1){
                int ataquePlayer = ocultista.ataque1();
                aberracao.LevarDano(ataquePlayer);
                System.out.println("\n\n o ocultista ataca a aberracao de sangue " +ataquePlayer + " de dano");
                
            }

            if (decisao == 2){
                int ataquePlayer = ocultista.ataque2();
                aberracao.LevarDano(ataquePlayer);
                System.out.println("\n\n o ocultista ataca a aberracao de sangue " +ataquePlayer + " de dano");
            }

            if (decisao == 3){
               ocultista.Pocao();
               //pocaoVida.PegouPocaoCura(); comando nao funcionou
            
            }

            if (decisao == 4) {
                break;
            }

    
            ocultista.LevarDano(ataqueInimigo);
           

            System.out.println("Aberracao ataca " + ataqueInimigo + " de dano");

            System.out.println("\nvida do ocultista " + ocultista.Vida());
            System.out.println("vida aberracao de sangue " + aberracao.Vida());


        

        
        
        }
        System.out.println("voce fugiu do combate");

    }else {
    System.out.println("voce escolheu nao lutar");
    }
    escolhaAtaque.close();
}
}
