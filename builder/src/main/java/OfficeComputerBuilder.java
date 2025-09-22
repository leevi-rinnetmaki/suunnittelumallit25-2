public class OfficeComputerBuilder implements ComputerBuilder {

    Computer computer;
    String processor;
    int RAM;
    String hardDrive;
    String graphicsCard;
    String operatingSystem;

    //The reason I used getenv, was because that was suggested by my ide and it was funny. All values show null or 0 on my pc and I have no clue what getenv actually is
    @Override
    public void buildProcessor() {
        processor = System.getenv("PROCESSOR_NAME");
    }

    @Override
    public void buildRAM() {
        if(System.getenv("RAM") == null) {
            RAM = 0;
        }else{
        RAM = Integer.parseInt(System.getenv("RAM"));
        }
    }

    @Override
    public void buildHardDrive() {
        hardDrive = System.getenv("HARDDRIVE");
    }

    @Override
    public void buildGraphicsCard() {
        graphicsCard = System.getenv("GraphicsCard");
    }

    @Override
    public void buildOperatingSystem() {
        operatingSystem = System.getenv("OPERATINGSYSTEM");
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
