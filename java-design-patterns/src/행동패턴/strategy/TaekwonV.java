package 행동패턴.strategy;

public class TaekwonV extends Robot {
    public TaekwonV(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
        super(name, movingStrategy, attackStrategy);
    }
}
