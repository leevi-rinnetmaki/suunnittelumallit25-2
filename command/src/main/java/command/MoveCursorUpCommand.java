package command;

import receiver.CursorLocation;

public class MoveCursorUpCommand implements Command {
    @Override
    public void execute() {

    }

    CursorLocation cursorLocation;

    public MoveCursorUpCommand(CursorLocation cursorLocation) {
        this.cursorLocation = cursorLocation;
    }
}
