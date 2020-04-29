package 행동패턴.command;

public class HeaterOnCommand implements Command {
    private static HeaterOnCommand heaterOnCommand;
    private Heater heater;
    private HeaterOnCommand() { }

    public static synchronized Command getCommand(Heater heater) {
        if(heaterOnCommand == null) {
            heaterOnCommand = new HeaterOnCommand();
        }
        heaterOnCommand.heater = heater;
        return heaterOnCommand;
    }

    @Override
    public void execute() {
        heater.turnOn();
    }
}
