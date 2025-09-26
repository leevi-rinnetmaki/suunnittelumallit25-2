public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new Tv());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("Tests with Awful remote.");
        AwfulRemote awfulRemote = new AwfulRemote(device);
        awfulRemote.power();
        awfulRemote.power();
        awfulRemote.power();
        device.printStatus();
        awfulRemote.volumeUp();
        awfulRemote.volumeDown();
        awfulRemote.volumeDown();
        awfulRemote.volumeDown();
        awfulRemote.power();
        awfulRemote.volumeDown();
        awfulRemote.volumeDown();
        awfulRemote.volumeDown();
        awfulRemote.power();
        awfulRemote.volumeUp();
        awfulRemote.volumeUp();

        awfulRemote.power();
        awfulRemote.channelUp();
        awfulRemote.channelDown();
        awfulRemote.channelUp();
        awfulRemote.channelDown();

    }
}