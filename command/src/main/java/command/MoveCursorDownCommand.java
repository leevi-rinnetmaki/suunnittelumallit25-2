package command;

import receiver.CursorLocation;

public class MoveCursorDownCommand implements Command {
    @Override
    public void execute() {

    }

    CursorLocation cursorLocation;

    public MoveCursorDownCommand(CursorLocation cursorLocation) {
        this.cursorLocation = cursorLocation;
    }
}
