package 행동패턴.command;

public class LightOnCommand implements Command {
    private static LightOnCommand lightOnCommand;
    private Light light;
    private LightOnCommand() {}

    public static synchronized Command getCommand(Light light) {
        if(lightOnCommand == null) {
            lightOnCommand = new LightOnCommand();
        }
        lightOnCommand.light = light;
        return lightOnCommand;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
