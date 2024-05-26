public class Computer implements IHardware, ISoftware {
    @Override
    public void turnOn() {
        System.out.println("Turn on computer");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off computer");
    }

    @Override
    public void installOS() {
        System.out.println("Install OS");
    }

    @Override
    public void uninstallSoftware() {
        System.out.println("uninstall software");
    }
}
