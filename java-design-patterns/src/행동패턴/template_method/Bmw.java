package 행동패턴.template_method;

public class Bmw extends Car {
    public Bmw(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println(this.toString()+" : BMW 전용 모터를 "+direction+" 방향으로 구동합니다");
    }

    @Override
    public String toString() {
        return "BMW";
    }
}
