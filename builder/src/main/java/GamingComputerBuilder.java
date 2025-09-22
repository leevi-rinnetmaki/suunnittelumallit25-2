public class GamingComputerBuilder implements ComputerBuilder{

    Computer computer;
    String processor;
    int RAM;
    String hardDrive;
    String graphicsCard;
    String operatingSystem;

    @Override
    public void buildProcessor() {
        processor = "Apollo Guidance Computer";
    }

    @Override
    public void buildRAM() {
        RAM = 4;
    }

    @Override
    public void buildHardDrive() {
        hardDrive = "hand-woven and non-volatile";
    }

    @Override
    public void buildGraphicsCard() {
        graphicsCard = "Hasselblad 70mm";
    }

    @Override
    public void buildOperatingSystem() {
        operatingSystem = "DOS";
    }

    @Override
    public Computer getComputer() {
        buildProcessor();
        buildRAM();
        buildHardDrive();
        buildGraphicsCard();
        buildOperatingSystem();
        computer = new Computer(processor, RAM, hardDrive, graphicsCard, operatingSystem);
        return computer;
    }
}
