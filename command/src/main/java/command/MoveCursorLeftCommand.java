package command;

import receiver.CursorLocation;

public class MoveCursorLeftCommand implements Command {
    @Override
    public void execute() {

    }

    CursorLocation cursorLocation;

    public MoveCursorLeftCommand(CursorLocation cursorLocation) {
        this.cursorLocation = cursorLocation;
    }
}
