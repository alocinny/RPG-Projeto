package personagens;
public class PontosHabilidade {
    private int pontosHabilidade = 0;
    
    public int GanharPontosHabilidade(){
        this.pontosHabilidade += 1;
        return this.pontosHabilidade;
    }
    
    public int GastarPontosHabilidades(){
        this.pontosHabilidade -= 1;
        return this.pontosHabilidade;
    }

    public boolean temPontosHabilidade(){
        return pontosHabilidade > 0;
    }
}
