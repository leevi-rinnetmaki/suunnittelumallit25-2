package receiver;

import client.StatusWindow;

import java.util.Arrays;

public class GenerateCodeReceiver {
    StatusWindow statusWindow;

    public GenerateCodeReceiver(StatusWindow statusWindow) {
        this.statusWindow = statusWindow;
    }

    public void generateCode(BooleanPixelGrid booleanPixelGrid) {
        int[][] array = booleanPixelGrid.activatedPixelsToArray();

        System.out.println("int[][] pixelArt = {");
        for (int row = 0; row < array.length; row++) {
            System.out.print("    {");
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]);
                if (col < array[row].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (row < array.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.println("};");
    }

}
