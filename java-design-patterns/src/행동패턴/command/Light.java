package 행동패턴.command;

public class Light extends Device {
    public Light(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "전등 ["+getName()+"]";
    }
}
