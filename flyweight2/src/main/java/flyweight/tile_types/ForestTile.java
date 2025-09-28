package flyweight.tile_types;

import flyweight.Tile;

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

}