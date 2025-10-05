package command;

import receiver.CursorLocation;

public class MoveCursorRightCommand implements Command {
    @Override
    public void execute() {

    }

    CursorLocation cursorLocation;

    public MoveCursorRightCommand(CursorLocation cursorLocation) {
        this.cursorLocation = cursorLocation;
    }
}
