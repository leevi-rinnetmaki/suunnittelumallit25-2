package flyweight.tile_types;

import flyweight.Tile;
import flyweight.TileGraphicFactory;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ForestTile implements Tile{
    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "Forest";
    }

    @Override
    public void action(){
        // action
    };

    @Override
    public void draw(GraphicsContext gc, int x, int y, int size) {
        Color color = TileGraphicFactory.getColor("Forest");
        gc.setFill(color);
        gc.fillRect(x, y, size, size);
    }
}