package 행동패턴.command;

public class OkGoogle {
    public void activate(Command command) {
        command.execute();
    }
}
