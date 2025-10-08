package client;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class StatusWindow {
    GridPane gridPane;
    int[] location;
    int[][] activatedPixels;

    public StatusWindow() {
            location = new int[2];
            activatedPixels = new int[8][8];
            makeGrid();
    }

    public void updateLocation(int[] location){
        this.location = location;
    }

    public void updateActivatedPixels(int[][] pixels){
        this.activatedPixels = pixels;
    }

    public void makeGrid() {
        gridPane = new GridPane();
        gridPane.setHgap(1);
        gridPane.setVgap(1);
        updateGrid();

    }
    public GridPane getGrid() {
        return gridPane;
    }

    public void updateGrid(){
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                if(activatedPixels[row][col] == 1){
                    Rectangle rectangle = new Rectangle(40, 40);
                    rectangle.setFill(Color.BLUE);
                    gridPane.add(rectangle, col, row);
                }
                else{
                    Rectangle rectangle = new Rectangle(40, 40);
                    rectangle.setFill(Color.GREEN);
                    gridPane.add(rectangle, col, row);
                }
                if(location[0]==col && location[1]==row) {
                    Rectangle rectangle = new Rectangle(20, 20);
                    rectangle.setFill(Color.BLACK);
                    gridPane.add(rectangle, col, row);
                    GridPane.setHalignment(rectangle, HPos.CENTER);
                    GridPane.setValignment(rectangle, VPos.CENTER);
                }
            }
        }
        //System.out.print(Arrays.toString(location));
    }
}