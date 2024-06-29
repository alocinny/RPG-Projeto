package Mapa;

public class MapaObjeto {
    private char caracterOBJ;
    private String nomeOBJ;

    public MapaObjeto(char caracterOBJ, String nomeOBJ){
        this.caracterOBJ = caracterOBJ;
        this.nomeOBJ = nomeOBJ;
    }

    public char getCaracterOBJ(){
        return caracterOBJ;
    }

    public String getNomeObj(){
        return nomeOBJ;
    }
}
