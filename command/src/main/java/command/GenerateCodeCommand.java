package command;

import receiver.CursorLocation;

public class GenerateCodeCommand implements Command {
    @Override
    public void execute() {

    }

    CursorLocation cursorLocation;

    public GenerateCodeCommand(CursorLocation cursorLocation) {
        this.cursorLocation = cursorLocation;
    }
}
