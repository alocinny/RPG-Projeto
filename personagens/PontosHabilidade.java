package personagens;
public class PontosHabilidade {
    private int pontosHabilidade = 0;
    
    public int GanharPontosHabilidade(){
        this.pontosHabilidade++;
        return this.pontosHabilidade;
    }
    
    public int GastarPontosHabilidades(){
        this.pontosHabilidade--;
        return this.pontosHabilidade;
    }
}
