package flyweight.tile_types;

import flyweight.Tile;

public class SwampTile implements Tile{
    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "Swamp";
    }

    @Override
    public void action(){
        // action
    };

}