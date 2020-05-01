package 행동패턴.strategy;

public enum Walking implements MovingStrategy {
    STRATEGY;

    @Override
    public void move() {
        System.out.println("걸어다닙니다");
    }
}
