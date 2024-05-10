import personagens.*;

public class Main {
    public static void main(String[] args){
        Atirador player = new Atirador();
        
        //esperando código dos inimigos pra rodar
        player.rodar();
        player.atirador();
        player.ataque(1);
        player.LevarDano(0);
        player.Vivo();
    }
}
