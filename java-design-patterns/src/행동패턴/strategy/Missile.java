package 행동패턴.strategy;

public enum Missile implements AttackStrategy {
    STRATEGY;

    @Override
    public void attack() {
        System.out.println("미사일 공격");
    }
}
