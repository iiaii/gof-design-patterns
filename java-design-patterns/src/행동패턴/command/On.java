package 행동패턴.command;

public enum On implements State {
    STATE;

    @Override
    public void onClick(Device device) {
        System.out.println(device.toString() +" : 이미 켜져 있습니다");
    }

    @Override
    public void offClick(Device device) {
        device.setState(Off.STATE);
        System.out.println(device.toString()+" : OFF");
    }
}
