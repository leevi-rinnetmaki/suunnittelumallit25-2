package flyweight.map_types;

import flyweight.Map;
import flyweight.Tile;
import flyweight.tile_types.BuildingTile;
import flyweight.tile_types.ForestTile;
import flyweight.tile_types.RoadTile;

public class CityMap extends Map {
    public CityMap(int width, int height){
        super(width, height);
    }

    @Override
    public Tile createTile() {
        double rand = Math.random();
        if(rand<(1d/3d)){
            return new RoadTile();
        }
        else if(rand<(2d/3d)){
            return new ForestTile();
        }
        else {
            return new BuildingTile();
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