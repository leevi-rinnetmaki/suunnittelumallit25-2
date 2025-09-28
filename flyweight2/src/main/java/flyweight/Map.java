package flyweight;

public abstract class Map {
    public Tile[][] tiles;
    public int width;
    public int height;
    public abstract Tile createTile();
    public abstract void display();

    public Map(int width, int height){
        this.width = width;
        this.height = height;
        tiles = new Tile[width][height];
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                tiles[i][j] = createTile();
            }
        }
    }
}