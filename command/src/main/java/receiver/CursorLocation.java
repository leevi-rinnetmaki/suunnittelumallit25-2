package receiver;

import client.StatusWindow;

public class CursorLocation {
    public int[] location = new int[2];
    StatusWindow statusWindow;

    public CursorLocation(StatusWindow statusWindow) {
        this.statusWindow = statusWindow;
    }
    public void moveCursorDownCommand() {
        if(location[1]<7){
            location[1]++;
            statusWindow.updateLocation(location);
            statusWindow.updateGrid();
        }
    }

    public void moveCursorLeftCommand() {
        if(location[0]>0){
            location[0]--;
            statusWindow.updateLocation(location);
            statusWindow.updateGrid();
        }
    }

    public void moveCursorRightCommand() {
        if(location[0]<7){
            location[0]++;
            statusWindow.updateLocation(location);
            statusWindow.updateGrid();
        }
    }

    public void moveCursorUpCommand() {
        if(location[1]>0){
            location[1]--;
            statusWindow.updateLocation(location);
            statusWindow.updateGrid();
        }
    }
}