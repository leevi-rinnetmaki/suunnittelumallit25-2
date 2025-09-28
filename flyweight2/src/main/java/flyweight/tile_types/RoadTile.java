package flyweight.tile_types;

import flyweight.Tile;

public class RoadTile implements Tile{
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public void action(){
        // action
    };

}