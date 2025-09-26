public class AwfulRemote implements Remote {
    protected Device device;

    public AwfulRemote(){}

    public AwfulRemote(Device device)
    {
        this.device = device;
    }

    @Override
    public void power() {
        if(Math.random()<0.5){
            device.enable();

            System.out.println("zrr. Device is on");
        }else{
            device.disable();
            System.out.println("zr. Device is off");
        }
    }

    @Override
    public void volumeDown() {
        if(Math.random()<0.9){
            device.setVolume((int)(device.getVolume()*Math.random()));
            System.out.println("zrr. Volume was lowered to " + device.getVolume());
        }else{
            device.disable();
            System.out.println("zr. Device is off. Accident happened when trying to lower volume.");
        }
    }

    @Override
    public void volumeUp() {
        if(Math.random()<0.9){
            device.setVolume(device.getVolume()+100);
            System.out.println("zrr. Volume was uppered to " + device.getVolume());
        }else{
            device.disable();
            System.out.println("zr. Device is off. Accident happened when trying to upper volume.");
        }
    }

    @Override
    public void channelDown() {
        if(Math.random()<0.9){
            device.setChannel(device.getChannel()+(int)(device.getChannel()*Math.random()*2));
            System.out.println("zrr. Channel was lowered to " + device.getChannel());
        }else{
            device.disable();
            System.out.println("Zr. Device is off. Accident happened when trying to lower channel.");
        }
    }

    @Override
    public void channelUp() {
        if(Math.random()<0.9){
            device.setChannel(device.getChannel()-(int)(device.getChannel()*Math.random()*2));
            System.out.println("Zrr. Channel was uppered to " + device.getChannel());
        }else{
            device.disable();
            System.out.println("Zr. Device is off. Accident happened when trying to upper channel.");
        }
    }
}
