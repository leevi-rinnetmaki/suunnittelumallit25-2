package command;

import receiver.BooleanPixelGrid;
import receiver.CursorLocation;
import receiver.GenerateCodeReceiver;

public class GenerateCodeCommand implements Command {
    @Override
    public void execute() {
        generateCodeReceiver.generateCode(booleanPixelGrid);
    }

    GenerateCodeReceiver generateCodeReceiver;
    BooleanPixelGrid booleanPixelGrid;

    public GenerateCodeCommand(GenerateCodeReceiver generateCodeReceiver, BooleanPixelGrid booleanPixelGrid) {
        this.generateCodeReceiver = generateCodeReceiver;
        this.booleanPixelGrid = booleanPixelGrid;
    }
}
