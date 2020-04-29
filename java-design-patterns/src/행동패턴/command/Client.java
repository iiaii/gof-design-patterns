package 행동패턴.command;

public class Client {
    public static void main(String[] args) {
        Heater livingRoomHeater = new Heater("거실");
        Light livingRoomLight1 = new Light("거실1");
        Light livingRoomLight2 = new Light("거실2");
        OkGoogle okGoogle = new OkGoogle();

        okGoogle.activate(HeaterOffCommand.getCommand(livingRoomHeater));
        okGoogle.activate(HeaterOnCommand.getCommand(livingRoomHeater));
        okGoogle.activate(HeaterOffCommand.getCommand(livingRoomHeater));
        System.out.println("---------------------");
        okGoogle.activate(LightOffCommand.getCommand(livingRoomLight1));
        okGoogle.activate(LightOnCommand.getCommand(livingRoomLight1));
        okGoogle.activate(LightOnCommand.getCommand(livingRoomLight1));
        okGoogle.activate(LightOffCommand.getCommand(livingRoomLight1));
        System.out.println("---------------------");
        okGoogle.activate(LightOnCommand.getCommand(livingRoomLight2));
        okGoogle.activate(LightOffCommand.getCommand(livingRoomLight2));
    }
}
