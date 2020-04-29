package 행동패턴.command;

public class HeaterOffCommand implements Command {
    private static HeaterOffCommand heaterOffCommand;
    private Heater heater;
    private HeaterOffCommand() { }

    public static synchronized Command getCommand(Heater heater) {
        if(heaterOffCommand == null) {
            heaterOffCommand = new HeaterOffCommand();
        }
        heaterOffCommand.heater = heater;
        return heaterOffCommand;
    }

    @Override
    public void execute() {
        heater.turnOff();
    }
}
