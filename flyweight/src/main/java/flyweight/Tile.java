package flyweight;

import javafx.scene.canvas.GraphicsContext;

public interface Tile {
    char getCharacter();

    String getType();

    void action();

    void draw(GraphicsContext gc, int x, int y, int size);
}