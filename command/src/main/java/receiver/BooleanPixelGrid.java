package receiver;
import client.StatusWindow;
import java.math.BigInteger;
import java.util.Arrays;

public class BooleanPixelGrid {
    BigInteger activatedPixels;
    BigInteger base;
    StatusWindow statusWindow;

    public BooleanPixelGrid(StatusWindow statusWindow) {
        this.activatedPixels = new BigInteger("0");
        this.base = new BigInteger("2");
        this.statusWindow = statusWindow;
    }

    public void toggleCurrentPixel(int[] location){
        if(checkIfPixelIsActivated(calculatePixelsLocationsValue(location))){
            activatedPixels = activatedPixels.subtract(base.pow(calculatePixelsLocationsValue(location)));
        }else{
            activatedPixels = activatedPixels.add(base.pow(calculatePixelsLocationsValue(location)));
        }
        statusWindow.updateActivatedPixels(activatedPixelsToArray());
        activatedPixelsToArray();
        statusWindow.updateGrid();
        //System.out.println("Activated pixels value: " + activatedPixels);
    }

    public boolean checkIfPixelIsActivated(int pixel){
        BigInteger counterPixel = new BigInteger("0");

        for(int counter = 63; counter>=0; counter--){
            if(activatedPixels.compareTo(base.pow(counter).add(counterPixel)) >= 0){
                counterPixel = counterPixel.add(base.pow(counter));
                if(counter == pixel){
                    return true;
                }
            }
        }
        return false;
    }

    public int calculatePixelsLocationsValue(int[] location){
        return location[0]+location[1]*8;
    }

    public int[][] activatedPixelsToArray(){
        int[][] array = new int[8][8];
        for(int row = 0; row<8; row++){
            for(int col = 0; col<8; col++){
                if(checkIfPixelIsActivated(calculatePixelsLocationsValue(new int[]{col, row}))){
                    array[row][col] = 1;
                }
            }
        }
        //System.out.println(Arrays.deepToString(array));
        return array;
    }
}