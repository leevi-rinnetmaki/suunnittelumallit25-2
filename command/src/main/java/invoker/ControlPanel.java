package invoker;

import command.Command;
import command.GenerateCodeCommand;

public class ControlPanel {
    Command moveCursorDownCommand;
    Command moveCursorLeftCommand;
    Command moveCursorRightCommand;
    Command moveCursorUpCommand;
    Command togglePixelCommand;
    Command generateCodeCommand;

    public ControlPanel(Command moveCursorDownCommand, Command moveCursorLeftCommand, Command moveCursorRightCommand, Command moveCursorUpCommand, Command togglePixelCommand, Command generateCodeCommand) {
        this.moveCursorDownCommand = moveCursorDownCommand;
        this.moveCursorLeftCommand = moveCursorLeftCommand;
        this.moveCursorRightCommand = moveCursorRightCommand;
        this.moveCursorUpCommand = moveCursorUpCommand;
        this.togglePixelCommand = togglePixelCommand;
        this.generateCodeCommand = generateCodeCommand;
    }

    public void moveCursorDown() {
        moveCursorDownCommand.execute();
    }

    public void moveCursorLeft() {
        moveCursorLeftCommand.execute();
    }

    public void moveCursorRight() {
        moveCursorRightCommand.execute();
    }

    public void moveCursorUp() {
        moveCursorUpCommand.execute();
    }

    public void togglePixel() {
        togglePixelCommand.execute();
    }

    public void generateCode() {
        generateCodeCommand.execute();
    }
}