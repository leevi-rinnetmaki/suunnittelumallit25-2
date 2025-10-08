package command;

import receiver.BooleanPixelGrid;
import receiver.CursorLocation;

public class MoveCursorLeftCommand implements Command {
    @Override
    public void execute() {
        cursorLocation.moveCursorLeftCommand();
    }

    CursorLocation cursorLocation;
    BooleanPixelGrid activatedPixels;

    public MoveCursorLeftCommand(CursorLocation cursorLocation,  BooleanPixelGrid activatedPixels) {
        this.cursorLocation = cursorLocation;
        this.activatedPixels = activatedPixels;
    }
}
