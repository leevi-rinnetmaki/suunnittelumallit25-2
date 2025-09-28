package flyweight;

import flyweight.map_types.CityMap;
import flyweight.map_types.WildernessMap;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
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
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Flyweight Map Example");

        Group root = new Group();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);

        // Create and draw map
        createMap("wilderness", 40, 40);
        map.display(gc);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /*
    public static void main(String[] args) {
        launch(args);
        Game game = new Game();
        game.createMap("city", 10, 10);
        game.map.display();
    }

     */
}