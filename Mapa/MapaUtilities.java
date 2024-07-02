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
        return (mapa[y][x]!=null) && (mapa[y][x].getCaracterOBJ() == '0' || mapa[y][x].getCaracterOBJ() == '1' || mapa[y][x].getCaracterOBJ() == '2' || mapa[y][x].getCaracterOBJ() == '3' || mapa[y][x].getCaracterOBJ() == '4' || mapa[y][x].getCaracterOBJ() == '5' || mapa[y][x].getCaracterOBJ() == '6' || mapa[y][x].getCaracterOBJ() == '7' || mapa[y][x].getCaracterOBJ() == '8' || mapa[y][x].getCaracterOBJ() == '9');
    }

    public boolean isCasa(MapaObjeto[][] mapa, int x, int y){
        return (mapa[y][x]!=null) && (mapa[y][x].getCaracterOBJ() == 'X');
    }

    public String proxCaracterWalkPlayer(MapaObjeto[][] mapa, int x, int y){
        if(mapa[y][x]!=null){
            return mapa[y][x].getNomeObj();
        }
        return ". ";
    }
}