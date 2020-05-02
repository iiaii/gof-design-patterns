package 행동패턴.template_method;

public abstract class Car {
    private Door door;
    private MotorStatus motorStatus;
    private Direction direction;

    public Car(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
        this.direction = Direction.NONE;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    private void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void openDoor() {
        if(motorStatus == MotorStatus.MOVING) {
            System.out.println(this.toString()+" : 이동중에는 문을 열 수 없습니다");
            return;
        }
        System.out.print(this.toString());
        door.open();
    }

    public void closeDoor() {
        System.out.print(this.toString());
        door.close();
    }

    public void move(Direction direction) {
        if(this.direction == direction && motorStatus == MotorStatus.MOVING) {
            System.out.println(this.toString()+" : "+"이미 "+direction+" 방향으로 이동중입니다");
            return;
        }

        if(door.getDoorStatus() == DoorStatus.OPEN) {
            System.out.print(this.toString());
            door.close();
        }

        setMotorStatus(MotorStatus.MOVING);
        setDirection(direction);
        moveMotor(direction);
        System.out.println(this.toString()+" : "+direction+" 방향으로 이동합니다");
    }

    public void stop() {
        setMotorStatus(MotorStatus.STOPPED);
        setDirection(Direction.NONE);
        System.out.println(this.toString()+" : "+"정지 합니다");
    }

    protected abstract void moveMotor(Direction direction);
    public abstract String toString();
}
