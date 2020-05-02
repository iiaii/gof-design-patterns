package 행동패턴.template_method;

public class Client {
    public static void main(String[] args) {
        Car tesla  =  new Tesla(new Door());
        Car bmw  =  new Bmw(new Door());

        tesla.openDoor();
        tesla.move(Direction.FORWARD);
        tesla.openDoor();
        tesla.stop();

        bmw.openDoor();
        bmw.move(Direction.BACKWARD);
        bmw.move(Direction.FORWARD);
        bmw.stop();
    }
}
