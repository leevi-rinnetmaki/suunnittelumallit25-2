package command;

import receiver.BooleanPixelGrid;
import receiver.CursorLocation;

public class MoveCursorUpCommand implements Command {
    @Override
    public void execute() {
        cursorLocation.moveCursorUpCommand();
    }

    CursorLocation cursorLocation;
    BooleanPixelGrid activatedPixels;

    public MoveCursorUpCommand(CursorLocation cursorLocation,  BooleanPixelGrid activatedPixels) {
        this.cursorLocation = cursorLocation;
        this.activatedPixels = activatedPixels;
    }
}
