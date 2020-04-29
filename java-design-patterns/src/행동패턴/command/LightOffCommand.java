package 행동패턴.command;

public class LightOffCommand implements Command {
    private static LightOffCommand lightOffCommand;
    private Light light;
    private LightOffCommand() {}


    public static synchronized Command getCommand(Light light) {
        if(lightOffCommand == null) {
            lightOffCommand = new LightOffCommand();
        }
        lightOffCommand.light = light;
        return lightOffCommand;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
