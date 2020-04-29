package 행동패턴.command;

public class Heater extends Device {
    public Heater(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "히터 ["+getName()+"]";
    }
}
