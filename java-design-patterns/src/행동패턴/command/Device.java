package 행동패턴.command;

public abstract class Device {
    private String name;
    private State state;

    public Device(String name) {
        this.name = name;
        state = Off.STATE;
    }

    public String getName() {
        return name;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnOn() {
        state.onClick(this);
    }

    public void turnOff() {
        state.offClick(this);
    }

    public abstract String toString();
}
