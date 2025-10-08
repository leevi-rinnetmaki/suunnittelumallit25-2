package client;

import command.*;
import invoker.ControlPanel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import receiver.BooleanPixelGrid;
import receiver.CursorLocation;
import receiver.GenerateCodeReceiver;

public class GUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        StatusWindow statusWindow = new StatusWindow();
        CursorLocation cursorLocation = new CursorLocation(statusWindow);
        BooleanPixelGrid booleanPixelGrid = new BooleanPixelGrid(statusWindow);
        GenerateCodeReceiver generateCodeReceiver = new GenerateCodeReceiver(statusWindow);

        Command moveCursorDownCommand = new MoveCursorDownCommand(cursorLocation, booleanPixelGrid);
        Command moveCursorLeftCommand = new MoveCursorLeftCommand(cursorLocation, booleanPixelGrid);
        Command moveCursorRightCommand = new MoveCursorRightCommand(cursorLocation, booleanPixelGrid);
        Command moveCursorUpCommand = new MoveCursorUpCommand(cursorLocation, booleanPixelGrid);
        Command togglePixelCommand = new TogglePixelCommand(cursorLocation, booleanPixelGrid);
        Command generateCodeCommand = new GenerateCodeCommand(generateCodeReceiver, booleanPixelGrid);

        ControlPanel controlPanel = new ControlPanel(moveCursorDownCommand, moveCursorLeftCommand, moveCursorRightCommand, moveCursorUpCommand,  togglePixelCommand, generateCodeCommand);


        GridPane gridPane = statusWindow.getGrid();
        VBox vBox = new VBox(gridPane);
        Scene scene = new Scene(vBox);
        scene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.DOWN){
                controlPanel.moveCursorDown();
            }
            else if(e.getCode() == KeyCode.LEFT){
                controlPanel.moveCursorLeft();
            }
            else if(e.getCode() == KeyCode.RIGHT){
                controlPanel.moveCursorRight();
            }
            else if(e.getCode() == KeyCode.UP){
                controlPanel.moveCursorUp();
            }
            else if(e.getCode() == KeyCode.SPACE){
                controlPanel.togglePixel();
            }
            else if(e.getCode() == KeyCode.ENTER){
                controlPanel.generateCode();
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}