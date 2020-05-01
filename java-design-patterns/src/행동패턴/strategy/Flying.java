package 행동패턴.strategy;

public enum Flying implements MovingStrategy {
    STRATEGY;

    @Override
    public void move() {
        System.out.println("날아다닙니다");
    }
}
