package Mapa;

public class MapaUtilities {
    public MapaObjeto getObjAt(MapaObjeto[][] mapa, int x, int y){
        return mapa[y][x];
    }

    public void removeObjAt(MapaObjeto[][] mapa, int x, int y){
        mapa[y][x] = null;
    }

    public boolean isValidPosition(int width, int height, int x, int y){
        return (x>=0) && (x<width) && (y>=0) && (y<height);
    }

    public boolean isPorta(MapaObjeto[][] mapa, int x, int y){
        return (mapa[y][x]!=null) && (mapa[y][x].getCaracterOBJ() == '|');
    }

    public boolean isCasa(MapaObjeto[][] mapa, int x, int y){
        return (mapa[y][x]!=null) && (mapa[y][x].getCaracterOBJ() == 'X');
    }
}