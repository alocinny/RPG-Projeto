package Mapa;

import Agentes.Agentes;
import Criaturas.Aberracao;
import Criaturas.Marionete;
import Criaturas.ZumbiDeSangue;
import Criaturas.Criaturas;

public class Mapa {

    private MapaObjeto[][] map;
    private Agentes agente;
    private int width;
    private int height;
    private Aberracao aberracao;
    private Marionete marionete;
    private ZumbiDeSangue zumbi;

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
        
        marionete = new Marionete();
        aberracao = new Aberracao();
        zumbi = new ZumbiDeSangue();

        //distribuindo no mapa cinzas Humanas que podem ser utilizadas no ritual de envelhecimento (cura) ou Ritual de descarnar
        map[2][3] = new MapaObjeto('H', "cinzas humanas");
        map[3][7] = new MapaObjeto('K', "chave 1");
        map[10][7] = new MapaObjeto('V', "chave 1");
        map[13][7] = new MapaObjeto('M', "chave 1");
        map[20][7] = new MapaObjeto('Z', "chave 1");
        map[zumbi.getY()][zumbi.getX()] = new MapaObjeto('C', "Zumbi De Sangue");
        map[aberracao.getY()][aberracao.getX()] = new MapaObjeto('C', "Aberração");
        map[marionete.getY()][marionete.getX()] = new MapaObjeto('C', "Marionete");
 
        drawCasa(5, 5);
    }

    public void addObjAt(char[][] map, MapaObjeto mapaObjeto, int x, int y){
        map[y+1][x+1] = mapaObjeto.getCaracterOBJ();
    }

    public void drawMapa(){

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(i == agente.getY() && j == agente.getX()){
                    System.out.print("A ");
                } else if(map[i][j] == null){
                    System.out.print(". ");
                } else {
                    System.out.print(map[i][j].getCaracterOBJ() + " ");
                }
            }
            System.out.println();
        }
    }

    public void drawCasa(int x, int y){
        for(int i=y;i<y+5;i++){
            for(int j=x;j<x+5;j++){
                if(i==y || i == y+4 || j==x || j==x+4){
                    map[i][j] = new MapaObjeto('X', "parede");
                } else {
                    map[i][j] = new MapaObjeto('.', "espaco vazio");
                }
            }
        }
        map[y+2][x] = new MapaObjeto('|', "porta");
    }

    public void setAgente(Agentes agente){
        this.agente = agente;
    }

    public MapaObjeto[][] getMap(){
        return map;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Criaturas getCriatura(int x, int y){
        if(x == zumbi.getX() && y == zumbi.getY()){
            return zumbi;
        } else
        if(x == marionete.getX() && y == marionete.getY()){
            return marionete;
        } else 
        if(x == aberracao.getX() && y == aberracao.getY()){
            return aberracao;
        } else {
            return null;
        }
    }
}