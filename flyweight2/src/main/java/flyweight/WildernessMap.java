package flyweight;

import flyweight.tile_types.ForestTile;
import flyweight.tile_types.SwampTile;
import flyweight.tile_types.WaterTile;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height){
        super(width, height);
    }

    @Override
    public Tile createTile() {
        double rand = Math.random();
        if(rand<(1d/3d)){
            return new SwampTile();
        }
        else if(rand<(2d/3d)){
            return new WaterTile();
        }
        else {
            return new ForestTile();
        }
    }

    @Override
    public void display() {
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                System.out.print(tiles[i][j].getCharacter());
            }
            System.out.println();
        }
    }
}