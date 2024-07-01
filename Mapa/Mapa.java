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
    private String stringI;
    private int i = 0;
    private char charI;


    public Mapa(int width, int height){
        this.width = width;
        this.height = height;
        map = new MapaObjeto[height][width];

        preencherMapa();
    }

    public void preencherMapa(){
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                map[i][j] = null;
            }
        }

        marionete = new Marionete();
        aberracao = new Aberracao();
        zumbi = new ZumbiDeSangue();
        
       
        // Desenhando uma casa no mapa
        
        //casa 1
        
        drawCasa(5, 5);
        //casa 2
        drawCasa(15, 5);
        //casa 3
        drawCasa(25, 5);
        //casa 4
        drawCasa(35, 2);
        //casa 5
        drawCasa(43, 2);
        //casa 6
        drawCasa(5, 23);
        //casa 7
        drawCasa(15, 23);
         //casa 8
        drawCasa(25, 23);
         //casa 9
        drawCasa(35, 20);
        //casa 10
        drawCasa(43, 20);
        // Distribuindo objetos no mapa
        //Cinzas
        map[2][3] = new MapaObjeto('H', "cinzas humanas");
        map[12][13] = new MapaObjeto('H', "cinzas humanas");
        map[22][23] = new MapaObjeto('H', "cinzas humanas");
        map[24][32] = new MapaObjeto('H', "cinzas humanas");
        map[15][36] = new MapaObjeto('H', "cinzas humanas");
        map[13][24] = new MapaObjeto('H', "cinzas humanas");
        map[13][36] = new MapaObjeto('H', "cinzas humanas");
        map[2][32] = new MapaObjeto('H', "cinzas humanas");
        map[8][7] = new MapaObjeto('H', "cinzas humanas");

        //chaves 
        map[3][7] = new MapaObjeto('1', "chave 1");
        map[18][7] = new MapaObjeto('2', "chave 2");
        map[19][24] = new MapaObjeto('3', "chave 3");
        map[15][38] = new MapaObjeto('4', "chave 4");
        map[28][42] = new MapaObjeto('5', "chave 5");

       //Objetos amaldicoados
       map[7][27] = new MapaObjeto('O', "objeto");
       map[25][27] = new MapaObjeto('O', "objeto");
       map[25][17] = new MapaObjeto('O', "objeto");
       map[10][17] = new MapaObjeto('O', "objeto");
       map[7][42] = new MapaObjeto('O', "objeto");
       map[22][45] = new MapaObjeto('O', "objeto");




        // Posicionando criaturas no mapa
        map[zumbi.getY()][zumbi.getX()] = new MapaObjeto('Z', "Zumbi De Sangue");
        map[aberracao.getY()][aberracao.getX()] = new MapaObjeto('B', "Aberração");
        map[marionete.getY()][marionete.getX()] = new MapaObjeto('M', "Marionete");

        // Desenhando uma casa no mapa
        //casa 1
    }

    public void addObjAt(char[][] map, MapaObjeto mapaObjeto, int x, int y){
        map[y+1][x+1] = mapaObjeto.getCaracterOBJ();
    }

    public void drawMapa(){

        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
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
        for(int i=y; i<y+5; i++){
            for(int j=x; j<x+5; j++){
                if(i==y || i == y+4 || j==x || j==x+4){
                    map[i][j] = new MapaObjeto('X', "parede");
                } else {
                    map[i][j] = new MapaObjeto('.', "espaco vazio");
                }
            }
        }
       
        stringI = toString(); 
        charI = stringI.charAt(0);
        map[y+2][x] = new MapaObjeto(charI, "porta");
        i++;
    }

    public String toString(){

        return ""+i;
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
        } else if(x == marionete.getX() && y == marionete.getY()){
            return marionete;
        } else if(x == aberracao.getX() && y == aberracao.getY()){
            return aberracao;
        } else {
            return null;
        }
    }
}