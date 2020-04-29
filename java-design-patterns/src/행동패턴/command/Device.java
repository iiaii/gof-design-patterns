package 행동패턴.command;

public abstract class Device {
    private String name;
    private DeviceStatus deviceStatus;

    public Device(String name) {
        this.name = name;
        deviceStatus = DeviceStatus.OFF;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        if(deviceStatus == DeviceStatus.ON) {
            System.out.println(this.toString() +" : 이미 켜져 있습니다");
            return;
        }
        deviceStatus = DeviceStatus.ON;
        System.out.println(this.toString()+" : ON");

    }

    public void turnOff() {
        if(deviceStatus == DeviceStatus.OFF) {
            System.out.println(this.toString() + " : 이미 꺼져 있습니다");
            return;
        }
        deviceStatus = DeviceStatus.OFF;
        System.out.println(this.toString()+" : OFF");
    }

    public abstract String toString();
}
