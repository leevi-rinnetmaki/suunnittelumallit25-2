package flyweight;

import flyweight.map_types.CityMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;


public class Game extends Application {
    Map map;
    void createMap(String type, int width, int height){
        if("city".equals(type)){
            map = new CityMap(width, height);
        }else if("wilderness".equals(type)){
            map = new WildernessMap(width, height);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(800, 600);
        Scene scene = new Scene(canvas.getParent(), 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        Game game = new Game();
        game.createMap("city", 10, 10);
        game.map.display();
    }
}