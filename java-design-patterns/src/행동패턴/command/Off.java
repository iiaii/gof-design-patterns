package 행동패턴.command;

public enum Off implements State {
    STATE;


    @Override
    public void onClick(Device device) {
        device.setState(On.STATE);
        System.out.println(device.toString()+" : ON");
    }

    @Override
    public void offClick(Device device) {
        System.out.println(device.toString() + " : 이미 꺼져 있습니다");
    }
}
