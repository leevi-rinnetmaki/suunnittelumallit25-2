package flyweight;

import flyweight.map_types.CityMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class Gui extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("RPG Flyweight Map");
        primaryStage.show();
    }
}