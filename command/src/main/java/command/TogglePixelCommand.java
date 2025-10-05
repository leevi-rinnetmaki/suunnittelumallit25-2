package command;

import receiver.CursorLocation;

public class TogglePixelCommand implements Command {
    @Override
    public void execute() {

    }

    CursorLocation cursorLocation;

    public TogglePixelCommand(CursorLocation cursorLocation) {
        this.cursorLocation = cursorLocation;
    }
}
