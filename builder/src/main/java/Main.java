public class Main {
    public static void main(String[] args) {
        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        ComputerDirector officeDirector = new ComputerDirector(officeComputerBuilder);
        Computer myOfficePC = officeDirector.buildComputer();
        System.out.println(myOfficePC);
        System.out.println(myOfficePC.processor);
        System.out.println(myOfficePC.RAM);
        System.out.println(myOfficePC.hardDrive);
        System.out.println(myOfficePC.graphicsCard);
        System.out.println(myOfficePC.operatingSystem);


        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector gamingDirector = new ComputerDirector(gamingComputerBuilder);
        Computer myGamingPC = gamingDirector.buildComputer();
        System.out.println(myGamingPC);
        System.out.println(myGamingPC.processor);
        System.out.println(myGamingPC.RAM);
        System.out.println(myGamingPC.hardDrive);
        System.out.println(myGamingPC.graphicsCard);
        System.out.println(myGamingPC.operatingSystem);

    }
}
