package 행동패턴.template_method;

public class Door {
    private DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSE;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void open() {
        System.out.println(" : 문을 엽니다");
        doorStatus = DoorStatus.OPEN;
    }

    public void close() {
        System.out.println(" : 문을 닫습니다");
        doorStatus = DoorStatus.CLOSE;
    }
}
