package command;

import receiver.BooleanPixelGrid;
import receiver.CursorLocation;

public class TogglePixelCommand implements Command {
    @Override
    public void execute() {
        booleanPixelGrid.toggleCurrentPixel(cursorLocation.location);
    }

    CursorLocation cursorLocation;
    BooleanPixelGrid booleanPixelGrid;

    public TogglePixelCommand(CursorLocation cursorLocation,  BooleanPixelGrid booleanPixelGrid) {
        this.cursorLocation = cursorLocation;
        this.booleanPixelGrid = booleanPixelGrid;
    }
}
