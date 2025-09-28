package flyweight.tile_types;

import flyweight.Tile;
import flyweight.TileGraphicFactory;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class WaterTile implements Tile{
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public void action(){
        // action
    };

    @Override
    public void draw(GraphicsContext gc, int x, int y, int size) {
        Color color = TileGraphicFactory.getColor("Water");
        gc.setFill(color);
        gc.fillRect(x, y, size, size);
    }
}