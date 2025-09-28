package flyweight.map_types;

import flyweight.Map;
import flyweight.Tile;
import flyweight.tile_types.*;
import javafx.scene.canvas.GraphicsContext;

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
    public void display(GraphicsContext gc) {
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                tiles[i][j].draw(gc, i * 10, j * 10, 40);
            }
        }
    }
}