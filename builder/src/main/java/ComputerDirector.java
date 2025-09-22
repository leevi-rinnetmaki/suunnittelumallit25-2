public class ComputerDirector {
    ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    Computer buildComputer() {
        return computerBuilder.getComputer();
    }
}
