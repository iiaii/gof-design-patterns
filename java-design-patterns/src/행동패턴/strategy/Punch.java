package 행동패턴.strategy;

public enum Punch implements AttackStrategy {
    STRATEGY;

    @Override
    public void attack() {
        System.out.println("펀치 공격");
    }
}
