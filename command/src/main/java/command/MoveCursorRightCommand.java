package command;

import receiver.BooleanPixelGrid;
import receiver.CursorLocation;

public class MoveCursorRightCommand implements Command {
    @Override
    public void execute() {
        cursorLocation.moveCursorRightCommand();
    }

    CursorLocation cursorLocation;
    BooleanPixelGrid activatedPixels;

    public MoveCursorRightCommand(CursorLocation cursorLocation,   BooleanPixelGrid activatedPixels) {
        this.cursorLocation = cursorLocation;
        this.activatedPixels = activatedPixels;
    }
}
