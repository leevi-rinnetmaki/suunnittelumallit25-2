package command;

import receiver.BooleanPixelGrid;
import receiver.CursorLocation;

public class MoveCursorDownCommand implements Command {
    @Override
    public void execute() {
        cursorLocation.moveCursorDownCommand();
    }

    CursorLocation cursorLocation;
    BooleanPixelGrid activatedPixels;

    public MoveCursorDownCommand(CursorLocation cursorLocation,  BooleanPixelGrid activatedPixels) {
        this.cursorLocation = cursorLocation;
        this.activatedPixels = activatedPixels;
    }
}
