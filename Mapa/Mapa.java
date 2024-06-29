package Mapa;

import Agentes.Agentes;

public class Mapa {

    private MapaObjeto[][] map;
    private Agentes agente;
    private int width;
    private int height;

    public Mapa(int width, int height){
        this.width = width;
        this.height = height;
        map = new MapaObjeto[height][width];

        preencherMapa();
    }

    public void preencherMapa(){
        for(int i=0;i<height;i++){
            for(int j=0; j<width;j++){
                map[i][j] = null;
            }
        }
        
        //distribuindo no mapa cinzas Humanas que podem ser utilizadas no ritual de envelhecimento (cura) ou Ritual de descarnar
        map[2][3] = new MapaObjeto('C', "cinzas humanas");
        map[3][7] = new MapaObjeto('C', "cinzas humanas");
        map[4][5] = new MapaObjeto('C', "cinzas humanas");
        
    }
    public void drawMapa(){
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(i == agente.getY() && j == agente.getX()){
                    System.out.print("A");
                } else if(map[i][j] == null){
                    System.out.print(". ");
                } else {
                    System.out.print(map[i][j].getCaracterOBJ() + " ");
                }
            }
            System.out.println();
        }
    }

    public void setAgente(Agentes agente){
        this.agente = agente;
    }

    public MapaObjeto getObjectAt(int x, int y){
        return map[y][x];
    }

    public void removeObjAt(int x, int y){
        map[y][x] = null;
    }

    public boolean isValidPosition(int x, int y){
        return x>=0 && x<width && y>=0 && y< height;
    }
}