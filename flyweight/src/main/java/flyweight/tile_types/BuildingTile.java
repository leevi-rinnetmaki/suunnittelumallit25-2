package flyweight.tile_types;

import flyweight.Tile;
import flyweight.TileGraphicFactory;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class BuildingTile implements Tile{
    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getType() {
        return "Building";
    }

    @Override
    public void action(){
        // action
    };

    @Override
    public void draw(GraphicsContext gc, int x, int y, int size) {
        Color color = TileGraphicFactory.getColor("Building");
        gc.setFill(color);
        gc.fillRect(x, y, size, size);
    }
}